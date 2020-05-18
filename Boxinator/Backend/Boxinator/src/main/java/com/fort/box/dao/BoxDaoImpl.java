package com.fort.box.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fort.box.model.Box;
import com.fort.box.util.DatabaseConnection;

public class BoxDaoImpl implements BoxDao{
	static Connection con = DatabaseConnection.getConnection(); 
	
	@Override
	public List<Box> getAllBoxes() throws SQLException {
		 String query = "select * from box"; 
	        PreparedStatement ps = con.prepareStatement(query); 
	        ResultSet rs = ps.executeQuery(); 
	        List<Box> boxlist = new ArrayList<Box>();
	  
	        while (rs.next()) { 
	        	Box box = new Box();
	        	box.setId(rs.getInt("id"));
				box.setName(rs.getString("name"));
				box.setWeight(rs.getInt("weight"));
				box.setColor(rs.getString("color"));
				box.setCountry(rs.getString("country"));
				boxlist.add(box);
	        } 
	        rs.close();
	        ps.close();
	        return boxlist; 
	}

	@Override
	public Box addBox(Box box) throws SQLException {
		String query = "insert into box(name, color, country, weight) VALUES (?, ?, ?, ?)"; 
    PreparedStatement ps = con.prepareStatement(query); 
    ps.setString(1, box.getName()); 
    ps.setString(2, box.getColor()); 
    ps.setString(3, box.getCountry());
    ps.setInt(4, box.getWeight());
    int n = ps.executeUpdate(); 
    ps.close();
    return box; 
	}

}
