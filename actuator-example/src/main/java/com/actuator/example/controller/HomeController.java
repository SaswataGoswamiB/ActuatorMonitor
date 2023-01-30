package com.actuator.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actuator.example.Entity.Student;

@RestController
public class HomeController {
	
	@Autowired
	private Student student;
	
	@GetMapping("/getdata")
	public Map<String,String> getdata()
	{
		return Map.of("Name","Saswata");
	}

}
