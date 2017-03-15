package com.hackathon.rest;
 
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.beans.TruckWaterDispense;
 
@Path("/handleDispenseRequest")
public class WaterDispensingResponse
{
	private static final transient ObjectMapper MAPPER = new ObjectMapper(); 
	
	@POST
	@Path("/fetchTrips")
	public Response fetchRequestReplyTrips()
	{
		ResponseBuilder builder = Response.status(200).entity(defaultJSON())
				.type(MediaType.APPLICATION_JSON);
		
		return builder.build();
	}
	
	private String defaultJSON()
	{
		TruckWaterDispense truckWaterDispense = new TruckWaterDispense();
		
		truckWaterDispense.setTruckId(12);
		truckWaterDispense.setTruckNumber("HR 51 BG 8863");
		truckWaterDispense.setAreaName("Sector 9A");
		truckWaterDispense.setNoOfPatches(9);
		truckWaterDispense.setWaterNeedDispense(200);

	    
	      try {
	    	  
			return MAPPER.writeValueAsString(truckWaterDispense);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ABCD";
	    
	  }
 
}