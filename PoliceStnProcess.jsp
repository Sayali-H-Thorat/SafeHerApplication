<%@page import="com.dao.PoliceStationDAO"%>
<%@page import="com.entity.PoliceStations"%>
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
String stn_name = request.getParameter("stn_name");
String city = request.getParameter("cty");
String latlng = request.getParameter("latlng");
String contact_no = request.getParameter("con_no");

PoliceStations p = new PoliceStations(stn_name,city,latlng,contact_no);
PoliceStationDAO udao =new PoliceStationDAO();
String stnid = udao.add(p);

response.sendRedirect("ShowPoliceStation.jsp");
%>

</body>
</html>