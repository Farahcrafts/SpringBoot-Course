<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>MVC Spring Boot</title>
	</head>
	<body>
		<h1>Bonjour </h1>
		<form action="addClient" method="post">
			Enter your id : <input type="number" name="id"><br>
			Enter your name : <input type ="text" name="name"> <br>
			<input type="submit" value="Submit">
		</form>
	</body>
</html>