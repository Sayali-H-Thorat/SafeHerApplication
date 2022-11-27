<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Title.jsp" %>

<h2><center>User Registration Form</center></h2>
<form method="post" action="UserProcess.jsp">
<table align="center">
<tr><td>Username<td><input type="text" name="uname">
<tr><td>Mobile <td><input type="text" name="umobile">
<tr><td>City <td><input type="text" name="ucity">
<tr><td><input type="submit" value="Save"><td><input type="reset" value="Clear">
</table>
</form>
</body>
</html>