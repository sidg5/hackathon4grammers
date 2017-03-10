package com.hackathon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class DBConnection 
{
	public static void main(String args[]) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hackathondb", "root", "");
			// here 132.186.96.129 : Roshni system ip
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from plantinfo");
			
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
}