package com.prowings.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.myapp.model.Student;
import com.prowings.myapp.service.RestApiConsumeService;

@RestController
//@RequestMapping("/consumeApi")
public class RestAPIConsumeController {

	@Autowired
	RestApiConsumeService service;
	@GetMapping
	@RequestMapping("/getStudent/{id}")
	public Student getStudentDataFromRestApi(@PathVariable int id)
	{
		
		System.out.println("Recievde request to fetch student detail from rest api");
		
		return service.getStd(id);
		
	}
}
