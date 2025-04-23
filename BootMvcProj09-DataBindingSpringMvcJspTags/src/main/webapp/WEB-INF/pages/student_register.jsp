<%@ page isELIgnored ="false" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri ="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student data</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	
	<h1 style="color: #c3325c; text-align:center"><b><i>Student Registration Form</i></b></h1>
	<hr>
	
	<frm:form action="register" method="POST" modelAttribute="stud">
	<h4 style="color: #05296b; text-align:center"><b><i>Fill the Form Details Corectly!!</i></b></h4>
	<table border="2" bgcolor="#fdac7a" align="center" width="25%">
	<tr>
	<td><b>Student Id::</b></td>
	<td><frm:input path="sno"/></td>
	</tr>
	
	<tr>
	<td><b>Student Name::</b></td>
	<td><frm:input path="sname"/></td>
	</tr>
	
	<tr>
	<td><b>Student Address::</b></td>
	<td><frm:input path="sadd"/></td>
	</tr>
	
	<tr>
	<td><b>Student Average::</b></td>
	<td><frm:input path="avg"/></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Register"></td>
	<td><input type="reset" value="Cancel"></td>
	</tr>
	
	</table>
	</frm:form>
</body>
</html>