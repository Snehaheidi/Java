<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registerPatientDetails</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
<h1>New Patient Details Register</h1>
<div class="division">
 <form action="Register" method="post">
   <table>
   <tr>
   <td>Enter Patient Name : </td>
   <td><input type=text id=pName name=pName></td>
   </tr>
   <tr>
   <td>Enter PhoneNumber : </td>
   <td><input type=text id=phNo name=phNo></td>
   </tr>
   <tr>
   <td>Enter Blood Group : </td>
   <td><input type=text id=inTime></td>
   </tr>
   <tr>
   <td>Enter Your City    : </td>
   <td><input type=text id=docTime></td>
   </tr>
   </table><br><br>
   <button id="submit">SUBMIT</button>
  </form>
  </div><br><br>
    <script src="RegisterJs.js"></script>
  <a href="Login.jsp">Back</a>
</body>
</html>