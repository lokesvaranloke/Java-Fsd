<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body>
	<h1>FlyAway</h1>
	<%
		String name = (String)session.getAttribute("name");
	%>
	<h2> Welcome <%=name %> to FlyAway for Booking Flight</h2>
	<%
		session = request.getSession();
		session.setAttribute("name", name);
	%>
	
	<h2>Flight Booking</h2>
	<form action="ListFlightServlet" method= "post" style="font-size: large;">
		<table>
			<tr>
				<td> Source :</td>
				<td> <input type="text" name="source"/></td>
			</tr>
			<tr>
				<td> Destination :</td>
				<td> <input type="text" name="destination"/></td>
			</tr>
			<tr>
				<td> Date :</td>
				<td> <input type="date" name="date"/></td>
			</tr>
			<tr>
				<td> Travelers :</td>
				<td> <input type="text" name="travelers"/></td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type="submit" value="search"/> 
				
			</tr>
		</table>
	</form>
</body>
</html>