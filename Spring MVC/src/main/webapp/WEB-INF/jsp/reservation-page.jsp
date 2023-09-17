<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation</title>
</head>
<body>
	<h2>Railway Reservation Form</h2>

	<form:form action="submitForm" modelAttribute="reservation">
First Name:<form:input path="firstName" />
		<br>
		<br>  
Last Name:<form:input path="lastName" />
		<br>
		<br>
		  
Gender:   
Male<form:radiobutton path="Gender" value="Male" />  
Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>  
Meals:  
BreakFast<form:checkbox path="Food" value="BreakFast" />  
Lunch<form:checkbox path="Food" value="Lunch" />  
Dinner<form:checkbox path="Food" value="Dinner" />
		<br>
		<br>
<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>