package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.*;
import com.demo.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/students-information")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping
	public ResponseEntity<StudentEntity> getAllStudents(){
		List<StudentEntity> res = studentService.getAllStudents();
		if (res.isEmpty()) {
			return new ResponseEntity("No Data Available", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
		
	}

	@GetMapping("/by-id/{id}")
	public ResponseEntity<StudentEntity> getAllStudentsById(@PathVariable(name = "id") Long id) {
		Optional<StudentEntity> res = studentService.getAllStudentsById(id);
		if (res== null) {
			return new ResponseEntity("No Data Available", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
	}

	@GetMapping("/by-name/{name}")
	public ResponseEntity<StudentEntity> getAllStudentsByName(@PathVariable(name = "name") String name) {
		
		StudentEntity res = studentService.getAllStudentsByName(name);
		if (res== null) {
			return new ResponseEntity("No Data Available", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
	}

	@GetMapping("/by-branch/{branch}")
	public ResponseEntity<StudentEntity> getAllStudentsByBranch(@PathVariable(name = "branch") String branch) {
		StudentEntity res = studentService.getAllStudentsByBranch(branch);
		if (res== null) {
			return new ResponseEntity("No Data Available", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
	}

	@GetMapping("/by-year/{year}")
	public ResponseEntity<StudentEntity> getAllStudentsByYear(@PathVariable(name = "year") String year) {
		StudentEntity res = studentService.getAllStudentsByYear(year);
		if (res== null) {
			return new ResponseEntity("No Data Available", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity studententity) {
		StudentEntity res = studentService.addStudent(studententity);
		if (res == null) {
			return new ResponseEntity("Cannot Add Student Data", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
	}
	
	@PutMapping
	public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity studententity) {
		StudentEntity res = studentService.updateStudent(studententity);
		if (res == null) {
			return new ResponseEntity("Cannot Add Student Data", HttpStatus.OK);
		}
		else {
			return new ResponseEntity(res, HttpStatus.OK);
		}
	}

}
