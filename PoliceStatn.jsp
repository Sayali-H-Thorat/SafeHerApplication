<%@page import="com.dao.PoliceStationDAO"%>
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
PoliceStations p = new PoliceStations("kotwali","Nagar","56'N,46'S","7058964555");
PoliceStationDAO udao =new PoliceStationDAO();
String s = udao.add(p);
out.println(s);
/*ArrayList<PoliceStations> lipolice_stations = udao.getAll();
out.println(lipolice_stations);*/

/*PoliceStations p1 = udao.getParticular(2);
if (p1 == null)
	out.println("No such police station!!!");
else
	out.println(p1);*/
	
	

%>
</body>
</html>