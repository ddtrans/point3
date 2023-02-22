package com.nagarro.azure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.azure.entity.Student;
import com.nagarro.azure.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
