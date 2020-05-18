package com.fort.box.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fort.box.dao.BoxDaoImpl;
import com.fort.box.model.Box;

@Service
public class BoxService {

	private BoxDaoImpl boxDao = new BoxDaoImpl();

	public List<Box> getAllBoxes() throws SQLException {
		return boxDao.getAllBoxes();
	}
	public Box addBox(Box box) throws SQLException {
		return boxDao.addBox(box);
	}
}
