package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainDAO {
Connection con =null;
	
	public Connection connect()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3308/safeher_db","root","Sayali@1212");
	}catch(Exception ee)
		{
		System.out.println(ee.toString());	
		}
		return con;
	}

}
