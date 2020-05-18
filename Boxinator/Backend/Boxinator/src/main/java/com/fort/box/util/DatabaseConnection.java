package com.fort.box.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Used Singleton pattern for database connection
public class DatabaseConnection {
	private static Connection con = null; 
	static
    { 
    	String url="jdbc:mysql://localhost:3306/boxinator";
    	String username="root";
    	String password="";
        try { 
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
    public static Connection getConnection() 
    { 
        return con; 
    } 
}
