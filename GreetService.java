package com.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.UsersDAO;
import com.entity.Users;

@Path("/greetserv")
public class GreetService {
	
	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetme()
	{
	 return "Good evening ";
	}
	
	
	@Path("/allusers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Users> getAllUsers()
	{
	UsersDAO udao = new UsersDAO();
	ArrayList<Users>liusers =	udao.getAll();
	return liusers;
	}

	@Path("/adduser")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addUser(@FormParam("uname") String uname, @FormParam("city") String city , @FormParam("mobile") String mobile)
	{
		
		Users u = new Users(uname, mobile, city);
		UsersDAO udao = new UsersDAO();
		String res = udao.add(u);
		return res;
	}
	
	
	@Path("/searchuser")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Users searchUser( @FormParam("mobile") String mobile)
	{
		
	
		UsersDAO udao = new UsersDAO();
		Users u = udao.searchUser(mobile);
		return u;
	}
}