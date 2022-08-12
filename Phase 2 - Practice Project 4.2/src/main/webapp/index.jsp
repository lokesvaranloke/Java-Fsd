<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Objects</title>
</head>
<body>
	<h2>Implicit Objects Examples</h2>
	<%
		out.println("Today is "+ new java.util.Date());
	%>
	<%
		int num = Integer.parseInt(request.getParameter("number"));
		out.println("Number is "+num);
	%>
	 
	

</body>
</html>