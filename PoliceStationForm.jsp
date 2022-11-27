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

<h2><center>Police Station Form</center></h2>
<form method="post" action="PoliceStnProcess.jsp">
<table align="center">
<tr><td>Station Name<td><input type="text" name="stn_name">
<tr><td>City <td><input type="text" name="cty">
<tr><td>Location <td><input type="text" name="latlng">
<tr><td>Contact No<td><input type="text" name="con_no">
<tr><td><input type="submit" value="Save"><td><input type="reset" value="Clear">
</table>
</form>
</body>
</html>