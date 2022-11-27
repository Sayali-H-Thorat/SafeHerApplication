package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.Users;

public class UsersDAO {
	
	MainDAO mdao = new MainDAO();
	String msg="";
	
	public String add(Users u)
	{
		Connection con = mdao.connect();
		try
		{
		if(con==null)
			msg="Connection is null !";
		else
		{
			PreparedStatement pstmt = con.prepareStatement("insert into users(username,mobile,city) values(?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, u.getUsername());
			pstmt.setString(2,u.getMobile());
			pstmt.setString(3, u.getCity());
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

	
	
	public ArrayList<Users> getAll()
	{
		ArrayList<Users> liusers = new ArrayList<>();
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from users");
	while(rs.next())
	{
		int uid = rs.getInt(1);
		String unm = rs.getString(2);
		String mob = rs.getString(3);
		String cty = rs.getString(4);
		Users u = new Users(uid, unm, mob, cty);
		liusers.add(u);
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return liusers;
	}
	

	
	
	public Users getParticular(int userid)
	{
		Users u=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from users where userid="+userid);
	if(rs.next())
	{
		int uid = rs.getInt(1);
		String unm = rs.getString(2);
		String mob = rs.getString(3);
		String cty = rs.getString(4);
		 u = new Users(uid, unm, mob, cty);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return u;
	}

	
	public Users searchUser(String mob)
	{
		Users u=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from users where mobile='"+mob+"'");
	if(rs.next())
	{
		int uid = rs.getInt(1);
		String unm = rs.getString(2);
		String mob1 = rs.getString(3);
		String cty = rs.getString(4);
		 u = new Users(uid, unm, mob1, cty);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return u;
	}

}