<%@ page import= "java.util.*" %>
<%@ page import= "java.sql.*" %>
<%@ page import="university.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentAllData</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div class="viewdata">
	<h1>Student Records</h1>
	<form>
	<table> 
	<tr>
	<th>Faculty-Name</th><th>&nbsp</th>
	<th>Date of Birth</th><th>&nbsp</th>
	<th>PhoneNumber</th><th>&nbsp&nbsp</th>
	<th>Email Id</th><th>&nbsp&nbsp</th>
	<th>College Name </th><th>&nbsp</th>
	<th>Course</th><th>&nbsp</th>
	<th>City</th>
	<th></th>
	</tr>
	<%
	ArrayList<Faculty> f = DaoOperation.viewFac();
	for(Faculty i : f){	
	%>
	<tr>
	<td><%=i.getFacname()%></td><td>&nbsp</td>
	<td><%=i.getFacdob()%></td><td>&nbsp</td>
	<td><%=i.getFacphNo() %></td><td>&nbsp</td>
	<td><%=i.getFacemail() %></td><td>&nbsp</td>
	<td><%=i.getFacCollege() %></td><td>&nbsp</td>
    <td><%=i.getFacCourse() %></td><td>&nbsp</td>
	<td><%=i.getFaccity() %></td>
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