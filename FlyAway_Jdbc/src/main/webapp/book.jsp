<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
</head>
<body>
	<h1>FlyAway</h1>
	<%
		String name = (String)session.getAttribute("name");
	%>
	<h2><%=name %> plesase provide details for booking</h2>
	<%
		session = request.getSession();
		session.setAttribute("name", name);
	%>
	<form action="BookUserDetails" method="post"> 
		<table>
			<tr>
				<td> Name :</td>
				<td> <input type="text" name="name"/></td>
			</tr>
			<tr>
				<td> Email :</td>
				<td> <input type="text" name="email"/></td>
			</tr>
			<tr>
				<td> Number :</td>
				<td> <input type="text" name="number"/></td>
			</tr>
			<tr>
				<td> Card Number :</td>
				<td> <input type="text" name="cardnumber"/></td>
			</tr>
			<tr>
				<td> Expire month :</td>
				<td> <input type="text" name="expiremonth"/></td>
			</tr>
			<tr>
				<td> CVV :</td>
				<td> <input type="password" name="cvv"/></td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type="submit" value="pay"/></td>
				
			</tr>
		</table>
	</form> 
</body>
</html>