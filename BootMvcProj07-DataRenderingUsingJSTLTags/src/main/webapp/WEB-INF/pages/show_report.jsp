<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Collection Of Model Class Object</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<h1 style="color: #b33678 ; text-align: center" ><b><i>Welcome To Collection Of Model Object</i></b>
	</h1>
	<hr>
	<c:choose>
		<c:when test="${!empty empsListInfo }">
			<table border="2" bgcolor="#af83cd" align="center" height="30%" width="30%">
				<tr>
					<th>eno</th>
					<th>ename</th>
					<th>salary</th>
					<th>vaccinated</th>
				</tr>

				<c:forEach var="emp" items="${empsListInfo}">
					<tr>
						<td>${emp.eno}</td>
						<td>${emp.ename}</td>
						<td>${emp.salary}</td>
						<td>${emp.vaccinated}</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
	
	<c:otherwise>
		<h1 style="color: #5f079c; text-align:center"><b><i>Employee Not Found</i></b></h1>
	</c:otherwise>
	
	</c:choose>
</body>
</html>