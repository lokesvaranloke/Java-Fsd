<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Flight</title>
</head>
<body>
	<h1>FlyAway</h1>
	<h2>List of Flights</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SOURCE</th>
			<th>DESTINATION</th>
			<th>DATE</th>
			<th>TIME</th>
			<th>PRICE</th>
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
		</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="adminhome.jsp">Home</a>
</body>
</html>