<%@page import="com.dao.EmergencyContactsDAO"%>
<%@page import="com.entity.EmergencyContacts"%>
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
String uid = request.getParameter("uid");
String conname = request.getParameter("conname");
String mobileno = request.getParameter("mobileno");

EmergencyContacts c  = new EmergencyContacts(uid,conname,mobileno);
EmergencyContactsDAO udao =new EmergencyContactsDAO();
String contactid = udao.add(c);

response.sendRedirect("ShowEmergencyContacts.jsp");
%>

</body>
</html>