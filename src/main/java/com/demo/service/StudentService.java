package com.demo.service;
import com.demo.entity.*;

import java.util.Optional;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	
	public List<StudentEntity>getAllStudents();
	
	public Optional<StudentEntity> getAllStudentsById(Long id);
	
	public StudentEntity getAllStudentsByName(String name);
	
	public StudentEntity getAllStudentsByBranch(String branch);
	
	public StudentEntity getAllStudentsByYear(String year);
	
	public StudentEntity addStudent(StudentEntity studentEntity);
	
	public StudentEntity updateStudent(StudentEntity studentEntity);
	

}
