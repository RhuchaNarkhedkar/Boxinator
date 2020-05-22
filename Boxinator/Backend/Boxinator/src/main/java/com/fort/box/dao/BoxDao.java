package com.fort.box.dao;

import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.fort.box.model.Box;

@Repository
public interface BoxDao {
	 public List<Box> getAllBoxes() throws SQLException; 
	public Box addBox(Box box) throws SQLException; 
}
