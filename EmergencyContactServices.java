package com.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmergencyContactsDAO;
import com.entity.EmergencyContacts;


@Path("/good")
public class EmergencyContactServices {
	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetme()
	{
	 return "Good evening ";
	}
	
	
	@Path("/viewofemergencycontacts")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<EmergencyContacts> getAllUsers()
	{
	EmergencyContactsDAO udao = new EmergencyContactsDAO();
	ArrayList<EmergencyContacts>liemergency_contacts =	udao.getAll();
	return liemergency_contacts;
	}

	@Path("/addecontacts")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addEmergencyContacts(@FormParam("uid") String uid, @FormParam("conname") String conname , @FormParam("mobno") String mobno)
	{
		
		EmergencyContacts c = new EmergencyContacts(uid,conname,mobno);
		EmergencyContactsDAO udao = new EmergencyContactsDAO();
		String res = udao.add(c);
		return res;
	}
	
	
	@Path("/searchEmergencyContacts")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public EmergencyContacts searchEmergencyContacts( @FormParam("conname") String conname)
	{
		
	
		EmergencyContactsDAO udao = new EmergencyContactsDAO();
		EmergencyContacts c = udao.searchEmergencyContacts(conname);
		return c;
	}
	
	

}
