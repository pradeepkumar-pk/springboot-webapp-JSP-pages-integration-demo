<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Menu Page</title>
</head>
<body>
	<h1>Welcome ${userName}</h1>

	<!-- 
<form action="operation" method="post">
      <input type="submit" name="option" value="Add student">
      <input type="submit" name="option" value="Delete student">
      <input type="submit" name="option" value="Update student">
      <input type="submit" name="option" value="View student"><br /> <br />
</form>
 -->

	<form action="AddRecord" method="get">
		<input type="submit" value="Add Records" /> <br /> <br />
	</form>
	
	<form action="ViewRecord" method="get">
		<input type="submit" value="View Records" /> <br /> <br />
	</form>
	
	<form action="EditRecord" method="get">
		<input type="submit" value="Edit Records" /> <br /> <br />
	</form>
	
	<form action="RemoveRecord" method="get">
		<input type="submit" value="Remove Records" /> <br /> <br />
	</form>
	
	


</body>
</html>