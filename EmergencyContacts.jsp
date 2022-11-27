<%@page import="com.dao.EmergencyContactsDAO"%>
<%@page import="com.entity.EmergencyContacts"%>
<%@page import="com.entity.PoliceStations"%>
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
EmergencyContacts c = new EmergencyContacts("1","sayali","4558984456");
EmergencyContactsDAO udao =new EmergencyContactsDAO();
String s = udao.add(c);
out.println(s);
/*ArrayList<EmergencyContacts> liemergency_contacts = udao.getAll();
out.println(liemergency_contacts);*/
/*EmergencyContacts c1 = udao.getParticular(2);
if (c1 == null)
	out.println("No such user!!!");
else
	out.println(c1);*/
	

%>
</body>
</html>
</body>
</html>