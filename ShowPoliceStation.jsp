<%@page import="com.dao.PoliceStationDAO"%>
<%@page import="com.entity.PoliceStations"%>
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
<h3><a href=PoliceStationForm.jsp>Click here to add new Police Station</a></h3>
<%
PoliceStationDAO udao =new PoliceStationDAO();
ArrayList<PoliceStations> lipolice_stations = udao.getAll();
%>
<center><h2>List of Police Stations<h2></center>
<table border=1 width=600 align=center>
<tr bgcolor=pink><th>stnid<th>stn_name<th>city<th>latlng<th>contact_no<th>
<%
for(PoliceStations p : lipolice_stations)
{
	int stnid = p.getStnid();
	String stn_name = p.getStn_name();
String cty = p.getCity();
String latlng = p.getLatlng();
String Contactno = p.getContact_no();

out.println("<tr><td>"+stnid +"<td>"+stn_name+"<td>"+cty+"<td>"+latlng+"<td>"+Contactno);
}

%>
</table>
</body>
</html>