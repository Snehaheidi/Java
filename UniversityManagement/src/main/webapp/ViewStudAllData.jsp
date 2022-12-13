<%@ page import= "java.util.*" %>
<%@ page import= "java.sql.*" %>
<%@ page import="university.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FacultyAllData</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div class="viewdata">
	<h1>Faculty Records</h1>
	<form>
	<table> 
	<tr>
	<th>Student-Id</th><th>&nbsp</th>
	<th>Student-Name</th><th>&nbsp</th>
	<th>Roll.NO</th><th>&nbsp</th>
	<th>Date Of Birth</th><th>&nbsp</th>
	<th>PhoneNumber</th><th>&nbsp&nbsp</th>
	<th>Email Id</th><th>&nbsp&nbsp</th>
	<th>City</th>
	<th></th>
	</tr>
	<%
	ArrayList<Student> s = DaoOperation.viewStud();
	for(Student i : s){	
	%>
	<tr>
	<td><%=i.getid() %></td><td>&nbsp</td>
	<td><%=i.getStudName()%></td><td>&nbsp</td>
	<td><%=i.getStudrollNo()%></td><td>&nbsp</td>
	<td><%=i.getStuddob() %></td><td>&nbsp</td>
	<td><%=i.getStudphNo() %></td><td>&nbsp</td>
	<td><%=i.getStudemail() %></td><td>&nbsp</td>
	<td><%=i.getStudcity() %></td>
	</tr>
	<%
	
	}	
	%>
	</table>
	</form><br><br><br><br>
	<a href="Admin.jsp">BACK</a>
	</div>
</body>
</html>