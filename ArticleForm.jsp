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

<h2><center>New Article</center></h2>
<form method="post" action="ArticleProcess.jsp">
<table align="center">
<tr><td>Title<td><input type="text" name="title">
<tr><td>Type <td><input type="text" name="type">
<tr><td>Link <td><input type="text" name="link">
<tr><td><input type="submit" value="Save"><td><input type="reset" value="Clear">
</table>
</form>
</body>
</html>