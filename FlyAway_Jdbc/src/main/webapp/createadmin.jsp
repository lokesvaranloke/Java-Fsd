<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Creation</title>
</head>
<body>
	<h1>FLYAWAY</h1><br/>
	<%
		String name = (String)session.getAttribute("name");
	%>
	<%
		session = request.getSession();
		session.setAttribute("name", name);
	%>
	<h2> Welcome <%=name %> to create new admins</h2>
	<form action="AdminServlet" method="post"> 
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
				<td> Password :</td>
				<td> <input type="password" name="password"/></td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type="submit" value="create"/></td>
				
			</tr>
		</table>
	</form> 
	<br/><br/>
	<a href="adminhome.jsp">Back Home</a>
</body>
</html>