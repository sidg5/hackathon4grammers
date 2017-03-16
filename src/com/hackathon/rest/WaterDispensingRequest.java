/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.hackathon.rest;

import java.sql.Connection;

import javax.ws.rs.FormParam;  
import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.core.Response;  

import com.hackathon.dao.ConnectToDB;
@Path("/waterDispensing")  
public class WaterDispensingRequest 
{
    @POST  
    @Path("/request")  
    public Response addUser(  
        @FormParam("truckid") String truckID)
    {  
        
        System.out.println("truckID:"+ truckID);
        ConnectToDB connectToDB = new ConnectToDB();
        Connection dbConnection = connectToDB.getDBConnection();
        
        System.out.println("dbConnection:"+ dbConnection);
   
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
