<%@page import="com.entity.EmergencyContacts"%>
<%@page import="com.dao.EmergencyContactsDAO"%>
<%@page import="com.entity.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.UsersDAO"%>
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
EmergencyContactsDAO udao =new EmergencyContactsDAO();
ArrayList<EmergencyContacts> liemergency_contacts = udao.getAll();

%>
<center><h2>List of Emergency Contacts</h2></center>
<table border=1 width=600 align=center>
<tr bgcolor=pink><th>Userid<th>Username<th>Mobile<th>City
<%
for(EmergencyContacts c : liemergency_contacts)
{
int conid = c.getContactid();
String uid = c.getUserid();
String conname = c.getContactname();
String mobileno = c.getMobileno();

out.println("<tr><td>"+conid +"<td>"+uid+"<td>"+conname+"<td>"+mobileno);
}

%>
</table>
</body>
</html>