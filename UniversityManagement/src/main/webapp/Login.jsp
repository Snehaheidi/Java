<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
	<a href="HomePage.jsp" style="float:right">Back to Home</a>
	<div class="container">
	<br><br>
		<h2>Login</h2>
		<form action="Logiin" method="post">
			<div class="innerContainer">
				<table>
					<tr>
						<td>User Name : </td>
						<td><input type="text" name="uName" id="uname"></td>
					</tr>
					<tr>
						<td> Password : </td>
						<td><input type="password" name="uPass" id="upass"></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td colspan="2">
							<button name="ok" id="ok">Ok</button>
							<br>
						<br>
						<br>
						<br>
						</td>
					</tr>
					<tr>
						<td style="float: right"><a href="forget.jsp">Forget Password?</a></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
	<script src="js/Validation.js"></script>
</body>
</html>