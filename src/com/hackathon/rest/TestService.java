package com.hackathon.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
 
@Path("message")
public class TestService
{
	@GET
	public String getMsg()
	{
		return "First ajax rest Call Success!!";
	}
 
}