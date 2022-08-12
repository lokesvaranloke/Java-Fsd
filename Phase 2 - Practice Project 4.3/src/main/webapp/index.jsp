<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directive</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h2>Directive Examples</h2>
	
	
	<%
		String[] cities = {"Mumbai" ,"London", "Bali"};
		pageContext.setAttribute("mycities", cities);
	%>
	
	<c:forEach var="city" items="${mycities}">
		${city}<br/>
	</c:forEach>
	

</body>
</html>