<%@page import="com.dao.ArticlesDAO"%>
<%@page import="com.entity.Articles"%>
<%@page import="com.entity.Users"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Articles a = new Articles("judo tutorial","video","https://meet.google.com/kqy-epkm-zgk");
ArticlesDAO udao =new ArticlesDAO();
String s = udao.add(a);
out.println(s);
/*<Articles> liarticles = udao.getAll();
out.println(liarticles);*/
/* a1 = udao.getParticular(2);
if (a1 == null)
	out.println("No such user!!!");
else
	out.println(a1);*/
	
	

%>
</body>
</html>