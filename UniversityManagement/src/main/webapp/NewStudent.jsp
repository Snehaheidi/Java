<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>newStudent</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
	<div class="container">
	<h1>Student Registeration</h1><br>
		<form action="AddStudent" method="post">
		<div class="innerContainer">
			<table>
				<tr>
					<td>Enter Student Name : </td>
					<td><input type="text" name="studName" id="studName"></td>				
				</tr>
				<tr>
					<td>Enter Student Roll Number : </td>
					<td><input type="text" name="studRollNo" id="studRollNo"></td>
				</tr>
				<tr>
					<td>Enter Date of Birth : </td>
					<td><input type="date" name="studDob" id="studDob"></td>
				</tr>
				<tr>
					<td>Enter Student Phone Number : </td>
					<td><input type="text" name="studPhno" id="studPhNo"></td>
				</tr>
				<tr>
					<td>Enter Email ID : </td>
					<td><input type="email" placeholder="username@gmail.com"
						name="studMail" id="studmail"></td>
				</tr>
				<tr>
					<td>Enter Student City : </td>
					<td><input type="text" name="studCity" id="studCity"></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td colspan="2">
						<button id="submit" name="submit">Submit</button>
						<br>
					<br>
					<br>
					<br>
					</td>
				</tr>
				<tr>
					<td><a style="float: left" href="Admin.jsp">Back</a></td>
				</tr>
			</table>
			</div>
		</form>
	</div>
	
	<script src="js/newStudentValidate.js"></script>
</body>
</html>