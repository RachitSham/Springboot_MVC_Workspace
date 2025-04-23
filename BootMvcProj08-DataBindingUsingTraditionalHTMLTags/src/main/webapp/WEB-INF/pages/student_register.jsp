	<%@ page isELIgnored="false" language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Student Register</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
		crossorigin="anonymous">
	</head>
	<body>
	
		<h1 style="color:#d45503" , text align="center">
			<b><i>🌟 Student Registration Page 🌟</i></b>
		</h1>
	<hr>
	<br>
	
		<form action="register" method="POST">
			<table align="center" bgcolor="#96c6f6">
				<tr>
					<td><b>Student Number:</b></td>
					<td><input type="text" name="sno" ></td>
				</tr>
	
				<tr>
					<td><b>Student Name:</b></td>
					<td><input type="text" name="sname"></td>
				</tr>
	
				<tr>
					<td><b>Student Address:</b></td>
					<td><input type="text" name="sadd" ></td>
				</tr>
	
				<tr>
					<td><b>Student Average:</b></td>
					<td><input type="text" name="avg" ></td>
				</tr>
				
				<tr>
				<td colspan="2"><input type="submit" value="Register"></td>
				
				</tr>
	
			</table>
		</form>
	
	</body>
	</html>