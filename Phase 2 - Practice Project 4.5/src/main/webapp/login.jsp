<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	if(username==null || username.equals("")|| password==null || password.equals("")){
		out.println("Invalid User Credentials");
	} else{
		session.setAttribute("name", username);
		response.sendRedirect("home.jsp");
	}
	
	%>
</body>
</html>