<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addnewfaculty</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
	<div class="container">
	<h1>Student Registeration</h1><br>
		<form action="AddFaculty" method="post">
		<div class="innerContainer">
			<table>
				<tr>
					<td>Enter Faculty Name : </td>
					<td><input type="text" name="facName" id="facName"></td>				
				</tr>
				<tr>
					<td>Enter Date of Birth : </td>
					<td><input type="date" name="facDob" id="facDob"></td>
				</tr>
				<tr>
					<td>Enter Phone Number : </td>
					<td><input type="text" name="facPhno" id="facPhNo"></td>
				</tr>
				<tr>
					<td>Enter Email ID : </td>
					<td><input type="email" placeholder="username@gmail.com"
						name="facMail" id="facmail"></td>
				</tr>
				<tr>
					<td>Working College Name : </td>
					<td><input type="text" name="facCollege" id="facCollege"></td>
				</tr>
				<tr>
					<td>Course : </td>
					<td><input type="text" name="facCourse" id="facCourse"></td>
				</tr>
				<tr>
					<td>City : </td>
					<td><input type="text" name="facCity" id="facCity"></td>
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
</body>
</body>
</html>