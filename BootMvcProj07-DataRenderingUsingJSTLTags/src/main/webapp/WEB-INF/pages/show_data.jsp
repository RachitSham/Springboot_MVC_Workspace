<%@ page isELIgnored="false" language="java" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model Class Obj</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<h1 style="color: #e56d0es ; text-align: center"><b><i>Welcome To Model Class Object</i></b>
	</h1>
	<hr>
	
	<c:if test="${!empty empInfo}">
		<h3 style="color: #72a828; text-align: center">
			<b><i>Employee Information :: ${empInfo.eno},
					${empInfo.ename}, ${empInfo.salary}, ${empInfo.vaccinated }</i></b>
		</h3>
	</c:if>

</body>
</html>