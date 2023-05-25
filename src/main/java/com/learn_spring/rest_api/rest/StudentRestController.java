package com.learn_spring.rest_api.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn_spring.rest_api.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;

	@PostConstruct
	public void loadData() {
		this.students = new ArrayList<>();

		this.students.add(new Student("Poornima", "Patel"));
		this.students.add(new Student("Mario", "Rosei"));
		this.students.add(new Student("Mary", "Smith"));
		this.students.add(new Student("Mary", "Kom"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.students;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if ( (studentId >= this.students.size()) || (studentId < 0) ) {
			throw new StudentNotFoundException("Student Id not Found - " + studentId);
		}

		return this.students.get(studentId);
	}

}
