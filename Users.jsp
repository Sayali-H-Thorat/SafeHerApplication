<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.UsersDAO"%>
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
Users u = new Users("user3","9822080876","Pune");
UsersDAO udao = new UsersDAO();
String s =  udao.add(u);
out.println(s);

/*ArrayList<Users> liusers = udao.getAll();

out.println(liusers);*/

/*
Users u1 = udao.getParticular(2);
if(u1==null)
	out.println("No such user !");
else
	out.println(u1);*/


%>
</body>
</html>