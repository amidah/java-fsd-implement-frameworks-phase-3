package com.simplilearn.spring.jdbcexample.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.simplilearn.spring.jdbcexample.bean.Employee;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into Employee values('" + e.getId() + "','" + e.getName() + "','" + e.getPassword()
				+ "', '" + e.getEmail() + "','" + e.getCountry() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update Employee set name='" + e.getName() + "', password='" + e.getPassword() + "', email='"
				+ e.getEmail() + "', country='" + e.getCountry() + "' where id = '" + e.getId() + "'";

		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(int id) {
		String query = "delete from Employee where id = '" + id + "'";
		return jdbcTemplate.update(query);
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee e) {
		String query = "insert into Employee values(?,?,?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setString(3, e.getPassword());
				ps.setString(4, e.getEmail());
				ps.setString(5, e.getCountry());

				return ps.execute();
			}
		});
	}

	public List<Employee> getEmplList(){
		return jdbcTemplate.query("select * from Employee", new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> empList = new ArrayList<Employee>();
				while(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setPassword(rs.getString(3));
					e.setEmail(rs.getString(4));
					e.setCountry(rs.getString(5));
					empList.add(e);
				}
				return empList;
			}
		
		});
	} 
}
