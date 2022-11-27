package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.Articles;

public class ArticlesDAO {
	
	MainDAO mdao = new MainDAO();
	String msg="";
	
	public String add(Articles a)
	{
		Connection con = mdao.connect();
		try
		{
		if(con==null)
			msg="Connection is null !";
		else
		{
			PreparedStatement pstmt = con.prepareStatement("insert into articles(title,type,link) values(?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, a.getTitle());
			pstmt.setString(2, a.getType());
			pstmt.setString(3, a.getLink());
			
			
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

	
	
	public ArrayList<Articles> getAll()
	{
		ArrayList<Articles> liarticles= new ArrayList<>();
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from articles");
	while(rs.next())
	{
		int article_id = rs.getInt(1);
		String title = rs.getString(2);
		String type = rs.getString(3);
		String link = rs.getString(4);
		
		Articles a = new Articles(article_id,title,type,link);
		liarticles.add(a);
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return liarticles;
	}
	

	
	
	public Articles getParticular(int article_id)
	{
		Articles a=null;
		try
		{
		Connection con = mdao.connect();
		
		if(con==null)
			msg="Connection is null !";
		else
		{
		Statement stmt = con.createStatement();
	ResultSet rs =	stmt.executeQuery("select * from articles where article_id="+article_id);
	if(rs.next())
	{
		int articleid = rs.getInt(1);
		String title = rs.getString(2);
		String type = rs.getString(3);
		String link = rs.getString(4);
		
		 a = new Articles(articleid, title, type,link);
		
		
	}
	stmt.close();
	con.close();
		}
		}
		catch (Exception e) {
		System.out.println(e);
		}
		return a;
	}

}