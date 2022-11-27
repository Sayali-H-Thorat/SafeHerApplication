<%@page import="com.dao.ArticlesDAO"%>
<%@page import="com.entity.Articles"%>
<%@page import="com.dao.UsersDAO"%>
<%@page import="com.entity.Users"%>
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
<%
String title = request.getParameter("title");
String type = request.getParameter("type");
String link = request.getParameter("link");

Articles a = new Articles(title,type,link);
ArticlesDAO udao =new ArticlesDAO();
String article_id = udao.add(a);

response.sendRedirect("ShowArticles.jsp");
%>

</body>
</html>