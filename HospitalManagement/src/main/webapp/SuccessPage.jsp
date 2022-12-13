<%@ page import= "java.util.*" %>
<%@ page import= "java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CHECK-UP DETAILS</title>
</head>
<body>
	<h2>RECORDS</h2>
	<form action="NewAppointment.jsp">
	<table> 
	<tr>
	<th>Patient-Id</th>
	<th>Out-Time</th>
	<th>Doctor-Time</th>
	<th>Waiting-Time</th>
	</tr>
	<%
	
	int id=(int) session.getValue("id");
	
	
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost/hospitalmanagement";
	String jdbcUsername = "root";
	String jdbcPassword = "root";
//	/Class.forName(dbDriver);
	Connection  con=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
	Statement st=con.createStatement();
	String sql="SELECT * FROM hospitalmanagement.time_table WHERE Patient_ID="+id+";";
	ResultSet rs=st.executeQuery(sql);
	//System.out.println("ididid:::: ");
	//System.out.print(p_id);
	while(rs.next()){	
	%>
	<tr>
	<td><%=rs.getString("patient_id") %></td>
	<td><%=rs.getString("out_time") %></td>
	<td><%=rs.getString("doctor_time") %></td>
	<td><%=rs.getString("waiting_time") %></td>
	</tr>
	<%
	
	}	
	%>
	<!-- <tr>
	<td><input type="button" value="Back" ></td>
	</tr> -->
	</table>
	</form>
	<a href="NewAppointment.jsp">BACK</a>
</body>
</html>