<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
	<h1>FlyAway</h1>
	<%
		String name = (String)session.getAttribute("name");
	%>
	<%
		session = request.getSession();
		session.setAttribute("name", name);
	%>
	<h2> Welcome <%=name %> to FlyAway Home Page</h2>
	
	<h2>Flight Booking</h2>
	<ul>
		<li><h3><a href="createadmin.jsp">Create New Admin</a><br/><br/></h3></li>
		<li><h3><a href="FlightServlet">View Flights</a><br/><br/></h3></li>
		<li><h3><a href="insertflight.jsp">Insert Flight</a></h3></li>
	</ul>
	<br/><br/>
	<a href="userlogin.html">LogOut</a>
</body>
</html>