/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.hackathon.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectToDB
{
    
    public Connection getDBConnection(){
        
        Connection connection= null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://132.186.96.207:3306/hackathon", "vipul", "vipul");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            // TODO Auto-generated catch block
            
        }
        return connection;
        
    }
}


/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 *
 * R8
 */
