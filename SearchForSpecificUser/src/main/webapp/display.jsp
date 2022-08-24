<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchForSpecificUser</title>
</head>
<body>
<table>
<tr><th>Empno</th><th>Empname</th><th>Empemail</th><th>Update</th></tr>
<%List<Employee> emp=(List<Employee>)request.getAttribute("list");
for(Employee e:emp){
%>
<tr><td><%=e.getEid() %></td><td><%=e.getEname() %></td><td><%=e.getEemail() %></td><td><a href="update.jsp">update</a></td></tr>
<%} %>

</table>
</body>
</html>
