<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new appoitment</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<td><a href="SuccessPage.jsp">Check-Up Details</a></td>
				<td>&nbsp&nbsp&nbsp</td>
				<td><a href="PatientDetails.jsp">Patient Details</a></td>
				<td>&nbsp&nbsp&nbsp</td>
				<td><a href="welcome.jsp">Logout</a><br></td>
			</tr>
		</table>
		<br>
		<h1>New Appoitment</h1>
		<form action="SummaryServlet" method="post">
			<table>
				<tr>
					<td>Enter In-Time :</td>
					<td><input type=text name="inTime"></td>
				</tr>
				<tr>
					<td>Enter Doctor-Time :</td>
					<td><input type=text name="docTime"></td>
				</tr>
				<tr>
					<td colspan="3"><button type=submit id=submit>SUBMIT</button></td>
				</tr>
			</table>
			<br>
			<br>
		</form>
	</div>
</body>
</html>