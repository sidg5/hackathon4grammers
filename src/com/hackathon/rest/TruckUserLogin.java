/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.hackathon.rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.hackathon.dao.ConnectToDB;

@Path("/userLogin")
public class TruckUserLogin
{
    Connection dbConnection;
    
    public TruckUserLogin()
    {
        ConnectToDB connectToDB = new ConnectToDB();
        dbConnection = connectToDB.getDBConnection();
    }
    
    @POST
    @Path("/request")
    public Response addUser(
        @FormParam("userid") String userID,
        @FormParam("password") String password,
        @FormParam("userRole") String userRole)
    {
        
        System.out.println("userID:" + userID +"password: "+password);
        String truckID="";
        Statement stmt;
        try
        {
            stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM userdetails WHERE  userid=\'"+userID+"\' AND password=\'"+password+"\' AND userRole=\'"+userRole+"\'");
            System.out.println("rs:" + rs);
            
            if (rs != null)
            {
                while (rs.next())
                {
                    truckID = rs.getString("truckId");
                    System.out.println(truckID + "\n");
                }
            }
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
        }
        
        //window.location.href = "file2.html"
        Response response = null;
        if(!truckID.isEmpty())
        {
            response = Response.status(200)
                .entity(truckID)
                .build();
        }
        else
        {
            response = Response.status(400)
            .entity("Truck ID not found for this user")
            .build();
        }
        return response;
    }
    
}

/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 * R8
 */
