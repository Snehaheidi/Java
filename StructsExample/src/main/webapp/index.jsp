<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	Welcome
	<s:form action="act">
		<s:textfield name="name" />
		<s:textfield name="email" />
		<s:submit value="Login" />
	</s:form>
</body>
</html>