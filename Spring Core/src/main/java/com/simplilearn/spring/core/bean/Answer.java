package com.simplilearn.spring.core.bean;

import java.util.Date;

public class Answer {

	private int id;
	private String answer;
	private Date postedDate;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}

}
