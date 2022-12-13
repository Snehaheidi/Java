<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" type="text/css" href="style/HomeBar.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<form>
	   <h3>University of S.T.C ,Chennai</h3>
		<div class="topnav">
			<a class="active" href="#home">Home</a> 
			<div class="dropdown">
				<button class="dropbutton">Portal   
				   <i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
					<a href="Login.jsp">Admin</a> 
					<a href="Login.jsp">Student</a> 
					<a href="Login.jsp">Faculty</a>
				</div>
			</div>
			<a href="Apply.jsp">Admission</a> 
			<a href="About.jsp">About</a> 
		</div>			
	</form>
</body>
</html>