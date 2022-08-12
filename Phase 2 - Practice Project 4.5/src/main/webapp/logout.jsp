<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% session.invalidate(); %>
	<h1>Your session is closed</h1>
	<a href="index.html">Login again</a>
</body>
</html>