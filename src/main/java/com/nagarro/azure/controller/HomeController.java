package com.nagarro.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.azure.entity.Student;
import com.nagarro.azure.service.StudentService;

@RestController
@RequestMapping("/student")
public class HomeController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public List<Student> getAllStudent(){
		return service.getAllStudents();
	}

}
