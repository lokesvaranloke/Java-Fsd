<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<h2>Product Details</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>COLOR</th>
			<th>PRICE</th>
		</tr>
		<c:forEach var="product" items="${products}">
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.color}</td>
			<td>${product.price}</td>
		</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="home.html">Home</a>
</body>
</html>