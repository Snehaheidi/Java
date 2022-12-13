<!--DISPLAYING INPUT TEXT BOX DATA PRINT IN WEB BRWOSER  -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
<h3>Check-up Summary</h3>
<br>
Your Id : ${pid} <br>
In-Time : ${inTime}<br>
Doctor Time : ${docTime}<br>
outTime :${outTime}<br>
wait Time : ${ waitTime}<br>

<br><br>
<a href="NewAppointment.jsp">BACK</a>
</body>
</html>