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
			/*Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hackathondb", "root", "");
			// here 132.186.96.129 : Roshni system ip
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from plantinfo");*/
			
			/*while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			con.close();*/
			printQuotientAndRemainder(10, 3);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	static void printQuotientAndRemainder(int dividend, int divisor)
	{
		int remainder = 0;
		int count = 0;
		
		do
		{
			remainder = dividend - divisor;
			dividend = remainder;
			count ++;
		}
		while(remainder> divisor);
		
		System.out.println("Remainder is "+ remainder);
		System.out.println("Quotient is "+ count);
	}
	
}