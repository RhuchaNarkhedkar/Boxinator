package com.fort.box.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fort.box.model.Box;
import com.fort.box.service.BoxService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/boxinator")
public class BoxController {
	@Autowired
	private BoxService service;

	@GetMapping(value = "/listboxes")
	public List<Box> getAllBoxes() throws SQLException {
		return service.getAllBoxes();
	}

	@PostMapping("/addbox")
	public Box addBox(@RequestBody Box box) throws SQLException {
		return service.addBox(box);
	}
}