package com.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.PoliceStationDAO;
import com.entity.PoliceStations;
import com.entity.Users;

@Path("/great")
public class PoliceStationService {
	
	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetme()
	{
	 return "Good evening ";
	}
	


	
	@Path("/allpolice_stations")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PoliceStations>getAllPolice_Stations()
	{
		PoliceStationDAO udao =new PoliceStationDAO();
		ArrayList<PoliceStations> lipolice_stations = udao.getAll();
	return lipolice_stations;
	}

	
	
	@Path("/searchcity")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public PoliceStations searchPoliceStations( @FormParam("city") String city)
	{
		
	
		PoliceStationDAO udao =new PoliceStationDAO();
		PoliceStations p1  = udao.searchPoliceStations(city);
		return p1;
	}
}
	
	


