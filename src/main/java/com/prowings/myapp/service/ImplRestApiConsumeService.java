package com.prowings.myapp.service;

import org.springframework.stereotype.Service;

import com.prowings.myapp.model.Student;

@Service
public class ImplRestApiConsumeService implements RestApiConsumeService{

	@Override
	public Student getStd(int id) {
	
		
		return new Student(10, "Ram", "Pune", 23283647);
	
	
	}

}
