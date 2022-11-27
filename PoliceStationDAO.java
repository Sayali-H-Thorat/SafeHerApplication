package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.PoliceStations;
import com.entity.Users;

public class PoliceStationDAO {
	
	MainDAO mdao = new MainDAO();
	String msg="";
	
	public String add(PoliceStations p)
	{
		Connection con = mdao.connect();
		try
		{
		if(con==null)
			msg="Connection is null !";
		else
		{
			PreparedStatement pstmt = con.prepareStatement("insert into police_stations(stn_name,city,latlng,contact_no) values(?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, p.getStn_name());
			pstmt.setString(2, p.getCity());
			pstmt.setString(3, p.getLatlng());
			pstmt.setString(4, p.getContact_no());
			
			pstmt.executeUpdate();
			msg="Done";
			
		ResultSet rs =	pstmt.getGeneratedKeys();
		if(rs.next())
			msg = rs.getString(1);
			pstmt.close();
			con.close();	
			
		}
		}catch (Exception e) {
			msg=e.toString();
		}
		return msg;
		
	}

	
	
	public ArrayList<PoliceStations> getAll()
	{
		ArrayList<PoliceStations> lipolice_stations= new ArrayList<>();
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from police_stations");
	while(rs.next())
	{
		int stnid = rs.getInt(1);
		String stnname = rs.getString(2);
		String cty = rs.getString(3);
		String latlng = rs.getString(4);
		String conno = rs.getString(5);
		PoliceStations p = new PoliceStations(stnid,stnname, cty,latlng,conno);
		lipolice_stations.add(p);
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return lipolice_stations;
	}
	

	
	
	public PoliceStations getParticular(int stnid)
	{
		PoliceStations p=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from police_stations where stnid="+stnid);
	if(rs.next())
	{
		int stationid = rs.getInt(1);
		String stnname = rs.getString(2);
		String cty = rs.getString(3);
		String latlng = rs.getString(4);
		String conno = rs.getString(5);
		 p = new PoliceStations(stnid, stnname, cty,latlng,conno);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return p;
	}
	
	public PoliceStations searchPoliceStations(String city)
	{
		PoliceStations p=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from police_stations where city='"+city+"'");
	if(rs.next())
	{

		int stnid = rs.getInt(1);
		String stnname = rs.getString(2);
		String cty = rs.getString(3);
		String latlng = rs.getString(4);
		String conno = rs.getString(5);
		 p = new PoliceStations(stnid,stnname, cty,latlng,conno);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return p;
	}

}

