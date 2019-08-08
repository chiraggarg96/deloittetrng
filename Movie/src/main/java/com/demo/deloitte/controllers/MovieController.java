package com.demo.deloitte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.deloitte.dao.MovieDAO;
import com.demo.deloitte.model.Movie;



@RestController
public class MovieController {

	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping("/getMovie")
	public String getProduct() {
		return "Getting Product";
	}
	
	@RequestMapping("/saveMovie")
	public String saveProduct() {
		
		Movie  movie = new Movie(1, "Avenger", "Russo", 5000);
		movieDAO.save(movie);
		return "Saving movie";
	}
	
	
	
	

}
