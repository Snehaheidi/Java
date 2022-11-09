<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registerPatientDetails</title>
</head>
<body>
<h1>New Patient Details Register</h1>
 <form action="LoginPage" method="post">
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
   <td>Enter In-Time : </td>
   <td><input type=text id=inTime name=inTime></td>
   </tr>
   <tr>
   <td>Enter Doctor Time : </td>
   <td><input type=text id=docTime name=docTime></td>
   </tr>
   </table>
   <button id="submit"><b>SUBMIT</b></button>
  </form> <br><br>
  <a href="Login.jsp">Back</a><br><br>
  <script src="RegisterJs.js"></script>
</body>
</html>