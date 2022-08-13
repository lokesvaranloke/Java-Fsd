<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Insert</title>
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
	<h2> Welcome <%=name %> to insert new Flights</h2>
	<form action="FlightServlet" method="post"> 
		<table>
			<tr>
				<td> Name :</td>
				<td> <input type="text" name="name"/></td>
			</tr>
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
				<td> Time :</td>
				<td> <input type="time" name="time"/></td>
			</tr>
			<tr>
				<td> Price :</td>
				<td> <input type="text" name="price"/></td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type="submit" value="insert"/><td>
			</tr>
		</table>
	</form> 
</body>
</html>