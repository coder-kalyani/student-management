package com.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.entity.StudentEntity;
import com.demo.jpa.StudentJpa;
import com.demo.service.StudentService;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	StudentJpa studentJpa;

	public List<StudentEntity> getAllStudents() {
		List<StudentEntity> res = studentJpa.findAll();
		return res;
	}

	public Optional<StudentEntity> getAllStudentsById(Long id) {
		Optional<StudentEntity> res = studentJpa.findById(id);
		return res;

	}

	public StudentEntity getAllStudentsByName(String name) {
		StudentEntity res = studentJpa.findByName(name);
		return res;

	}

	public StudentEntity getAllStudentsByBranch(String branch) {

		StudentEntity res = studentJpa.findByBranch(branch);
		return res;

	}

	public StudentEntity getAllStudentsByYear(String year)  {

		StudentEntity res = studentJpa.findByYear(year);
		return res;

	}

	public StudentEntity addStudent(StudentEntity studentEntity) {

		StudentEntity res = studentJpa.save(studentEntity);
		return res;

	}
	
	public StudentEntity updateStudent(StudentEntity studentEntity) {

		StudentEntity res = studentJpa.save(studentEntity);
		return res;

	}
	
	public Optional<StudentEntity> deleteStudentbyid(Long id) {
		Optional<StudentEntity> res = studentJpa.findById(id);
		if(res.isEmpty()) {
			return res;
		}
		else {
			studentJpa.deleteById(id);;
		}
		return res;
	}
}
