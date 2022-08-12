<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Portal</title>
</head>
<body>
	<h2>Product Details Portal</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Color</th>
			<th>Price</th>
		</tr>
		
		<c:forEach var="product" items="${data}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.color}</td>
				<td>${product.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>