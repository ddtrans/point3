package com.nagarro.azure.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.azure.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
