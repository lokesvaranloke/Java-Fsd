<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Flight</title>
</head>
<body>
	<h1>FlyAway</h1>
	<%
		String name = (String)session.getAttribute("name");
	%>
	<h2> Available Flights for <%=name %></h2>
	<%
		session = request.getSession();
		session.setAttribute("name", name);
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SOURCE</th>
			<th>DESTINATION</th>
			<th>DATE</th>
			<th>TIME</th>
			<th>PRICE</th>
			<th>BOOK NOW</th>
		</tr>
		<c:forEach var="flight" items="${flights}">
		<tr>
			<td>${flight.id}</td>
			<td>${flight.name}</td>
			<td>${flight.source}</td>
			<td>${flight.destination}</td>
			<td>${flight.date}</td>
			<td>${flight.time}</td>
			<td>${flight.price}</td>
			<td><a href="book.jsp">Book Now</a></td>
		</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>