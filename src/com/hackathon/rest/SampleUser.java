package com.hackathon.rest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.hackathon.dao.ConnectToDB;

@Path("/water")
public class SampleUser {

	@POST
	@Path("/dispense")
	public Response addUser(@FormParam("truckid") String truckid) {
		System.out.println("truckid:" + truckid);
		int inserted = 0;
		ConnectToDB connectToDB = new ConnectToDB();
		Connection dbConnection = connectToDB.getDBConnection();

		System.out.println("dbConnection:" + dbConnection);
		Statement stmt;
		try {
			stmt = dbConnection.createStatement();
			inserted = stmt.executeUpdate("INSERT into requestdispensing (TruckId) VALUES(" + truckid + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String result;
		if (inserted == 1)
			result = "Data Inserted in DB for Truck ID: " + truckid;
		else
			result = "Error Inserting Data for Truck ID: " + truckid;
		return Response.status(200).entity(result).build();
	}

}