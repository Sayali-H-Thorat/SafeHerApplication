<%@page import="java.util.ArrayList"%>
<%@page import="com.entity.Articles"%>
<%@page import="com.dao.ArticlesDAO"%>
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
<h3><a href=ArticleForm.jsp>Click here to add new Articles</a></h3>
<%
ArticlesDAO udao =new ArticlesDAO();
ArrayList<Articles> liarticles = udao.getAll();

%>
<center><h2>List of Articles</h2></center>
<table border=1 width=600 align=center>
<tr bgcolor=pink><th>Articleid<th>Title<th>Type<th>Link
<%
for(Articles a : liarticles)
{
int aid = a.getArticleid();
String atitle = a.getTitle();
String atype = a.getType();
String link = a.getLink();

out.println("<tr><td>"+aid +"<td>"+atitle+"<td>"+atype+"<td>"+link);
}

%>
</table>
</body>
</html>
</body>
</html>