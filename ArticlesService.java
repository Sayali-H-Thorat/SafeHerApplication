package com.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ArticlesDAO;
import com.entity.Articles;

@Path("/art")
public class ArticlesService {

	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetme()
	{
	 return "Good evening ";             
	}
	
	
	@Path("/allarticles")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Articles> getAllArticles()
	{
	ArticlesDAO udao = new ArticlesDAO();
	ArrayList<Articles>liarticles =	udao.getAll();
	return liarticles;
	}

	
}
