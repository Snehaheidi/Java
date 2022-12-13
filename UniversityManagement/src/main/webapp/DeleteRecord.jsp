<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
	<div class="container">
	<br><br>
		<h2>Delete Record</h2><br>
		<div>${message}</div><br>
		<form action="DeleteRecord" method="post">
			<div class="innerContainer">
				<table>
					<tr>
						<td>User Name : </td>
						<td><input type="text" name="uName" id="uName"></td>
					</tr>
					<tr>
						<td> Password : </td>
						<td><input type="password" name="uPass" id="uPass"></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td colspan="2">
							<button name="delete" id="delete">Delete</button>
							<br>
						<br>
						<br>
						<br>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>
