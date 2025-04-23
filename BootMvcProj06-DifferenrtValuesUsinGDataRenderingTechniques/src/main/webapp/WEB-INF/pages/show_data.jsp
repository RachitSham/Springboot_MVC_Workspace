<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Collections And Arrays</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

<h3 style="color: #28a839"><b>
		<i>🌟Passing Collections And Arrays Values From Controller Component To
				View Component Using Data Rendring Techniques[as Model
				Attribute]..🌟😊</i></b></h3>
	
	<br>
		<h4 style="color: #1c4bdf"><b><i> Model Attributes Data Is ::</i></b></h4>
		<h5 style="color: #a1c455"><i>Fav Colors Are :: <%= Arrays.toString(((String[])request.getAttribute("favColors")))%></i></h5>
		<h5 style="color: #a1c455"><i>Nick Names Are :: ${nikNames} </i></h5>
		<h5 style="color: #a1c455"><i>Phone Numbers Are :: ${phoneNumbers}</i></h5>
		<h5 style="color: #a1c455"><i>Id Details Are :: ${idDetails} </i></h5>
		

</body>
</html>