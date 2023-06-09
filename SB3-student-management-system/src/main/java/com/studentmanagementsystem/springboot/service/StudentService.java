package com.studentmanagementsystem.springboot.service;

import java.util.List;

import com.studentmanagementsystem.springboot.entity.Student;

public interface StudentService {
	// Get all the students 
	List<Student> getAllStudents();
	
	// Save the student
	Student saveStudent(Student student);
	
	// Update the student
	Student updateStudent(Student student);
	
	// Get Student By Id
	Student getStudentById(long id);
	
	// Delete Student By Id
	void deleteStudentById(Long id);
}
