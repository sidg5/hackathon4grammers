/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.hackathon.rest;

import javax.ws.rs.FormParam;  
import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.core.Response;  
@Path("/waterDispensing")  
public class WaterDispensingRequest 
{
    @POST  
    @Path("/request")  
    public Response addUser(  
        @FormParam("truckID") int truckID)
    {  
   
        return Response.status(200)  
            .entity(" Product added successfuly!<br> Id: "+truckID)  
            .build();  
    }  
}


/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 *
 * R8
 */
