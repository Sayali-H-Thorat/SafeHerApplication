package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.EmergencyContacts;
import com.entity.Users;

public class EmergencyContactsDAO {
	
	MainDAO mdao = new MainDAO();
	String msg="";
	
	public String add(EmergencyContacts c)
	{
		Connection con = mdao.connect();
		try
		{
		if(con==null)
			msg="Connection is null !";
		else
		{
			PreparedStatement pstmt = con.prepareStatement("insert into emergency_contacts(userid,contactname,mobileno) values(?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			
			
			pstmt.setString(1, c.getUserid());
			pstmt.setString(2,c.getContactname());
			pstmt.setString(3, c.getMobileno());
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

	
	
	public ArrayList<EmergencyContacts> getAll()
	{
		ArrayList<EmergencyContacts> liemergency_contacts = new ArrayList<>();
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from emergency_contacts");
	while(rs.next())
	{
		int conid = rs.getInt(1);
		String uid = rs.getString(2);
		String conname = rs.getString(3);
		String mobno = rs.getString(4);
		EmergencyContacts c = new EmergencyContacts(conid,uid, conname, mobno);
		liemergency_contacts.add(c);
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return liemergency_contacts;
	}
	

	
	
	public EmergencyContacts getParticular(int conid)
	{
		EmergencyContacts c=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from emergency_contacts where conid="+conid);
	if(rs.next())
	{
		int contactid = rs.getInt(1);
		String uid = rs.getString(2);
		String conname = rs.getString(3);
		String mobno = rs.getString(4);
		 c = new EmergencyContacts(conid,uid, conname, mobno);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return c;
	}
	public EmergencyContacts searchEmergencyContacts(String conname)
	{
		EmergencyContacts c=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from emergency_contacts where contactname='"+conname+"'");
	if(rs.next())
	{
		int conid = rs.getInt(1);
		String uid = rs.getString(2);
		String conname1 = rs.getString(3);
		String mobno = rs.getString(4);
		 c = new EmergencyContacts(conid, uid, conname1, mobno);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return c;
	}
	

}