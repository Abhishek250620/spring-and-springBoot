package com.studentmanagementsystem.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmanagementsystem.springboot.entity.Student;
import com.studentmanagementsystem.springboot.repository.StudentRepository;
import com.studentmanagementsystem.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
