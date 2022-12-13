<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>heidihospital</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
 <h1>LOG IN !!!</h1>
 <div class="division">
  <form action="LoginPage" method="post">
   <table>
   <tr>
   <td>Enter PatientID : </td>
   <td><input type=text name="pId" id="pid"></td>
   </tr>
   <tr>
   <td>Enter PhoneNumber: </td>
   <td><input type=text name="phNo" id="phno"></td>
   </tr>
   <tr>
   <td colspan="3"><button type=submit id="submit1">SUBMIT</button></td></tr>
   </table><br><br>
   </form>
   </div><br><br>
     <script src="RegisterJs.js"></script>
  <a href="NewRegister.jsp">NewRegister</a>
</body>
</html>