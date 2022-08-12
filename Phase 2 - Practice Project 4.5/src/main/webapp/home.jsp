<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome <%= session.getAttribute("name") %> to the home page</h2>
	
	<a href="logout.jsp">Click here to logout</a>
</body>
</html>