<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" type="text/css" href="style/HomeBar.css">
</head>
<body>
	<form action="" method="post">
		<div class="topnav">
			<a class="active" href="#profile">Profile</a>
			<div class="dropdown">
				<button class="dropbutton">
					Student <i class="fa fa-caret-down" aria-hidden="true"></i>
				</button>
				<div class="dropdown-content">
					<a href="#edit">Edit Student</a> 
					<a href="NewStudent.jsp">Add Student</a>
					<a href="ViewStudAllData.jsp">View All Student</a> 
					<a href="DeleteRecord.jsp">Delete Student</a>
				</div>
			</div>
			<div class="dropdown">
				<button class="dropbutton">
					Faculty <i class="fa fa-caret-down" aria-hidden="true"></i>
				</button>
				<div class="dropdown-content">
					<a href="#edit">Edit Faculty</a> 
					<a href="AddNewFaculty.jsp">Add Faculty</a> 
					<a href="ViewFacAllData.jsp">View All Faculty</a>
					<a href="DeleteRecord.jsp">Delete Faculty</a>
				</div>
			</div>
			<!-- <div class="dropdown">
				<button class="dropbutton">
					Course <i class="fa fa-caret-down" aria-hidden="true"></i>
				</button>
				<div class="dropdown-content">
					<a href="#edit">Edit Course</a> 
					<a href="#insert">Insert Course</a> 
					<a href="#view">View All Course</a>
					<a href="DeleteRecord.jsp">Delete Course</a>
				</div>
			</div>-->
			<div class="dropdown">
				<button class="dropbutton">
					College <i class="fa fa-caret-down" aria-hidden="true"></i>
				</button>
				<div class="dropdown-content">
					<a href="#edit">Edit College</a> 
					<a href="#insert">Add College</a> 
					<a href="#view">View All College</a>
					<a href="DeleteRecord.jsp">Delete College</a> <!-- NEW JSP CREATE IN DELETE COLLEGE-->
				</div>
			</div>
			<a href="HomePage.jsp" style="float: right">Logout</a>
		</div>
		<div>
			<h2>Welcome</h2>
		</div>
	</form>
</body>
</body>
</html>