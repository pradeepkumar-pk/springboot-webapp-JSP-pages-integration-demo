<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>HomePage</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="verifylogin" method="post">
		<input type="text" name="userName" value="admin"><br> 
		<input type="text" name="passWord" value="admin"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>