<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<h2>Product Details Portal</h2>
	<form action="productservlet" method="post">
		<table>
			<tr>
				<td>ID</td>
		   		<td><input type="text" name="productid"/></td>
		   	</tr>
		   	<tr>
				<td>Name</td>
		   		<td><input type="text" name="productname"/></td>
		   	</tr>
		   	<tr>
				<td>Color</td>
		   		<td> <input type="text" name="productcolor"/></td>
		   	</tr>
		   	<tr>
				<td>Price</td>
		   		<td><input type="text" name="productprice"/></td>
		   	</tr>
		   	<tr>
				<td></td>
		   		<td><input type="submit" value="submit"/></td>
		   	</tr>	
		</table>
	</form>
</body>
</html>