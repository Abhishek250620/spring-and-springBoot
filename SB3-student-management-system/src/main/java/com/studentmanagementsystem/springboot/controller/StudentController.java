package com.studentmanagementsystem.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanagementsystem.springboot.entity.Student;
import com.studentmanagementsystem.springboot.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/students") // Return students view
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new") // Return create_student view
	public String createStudentFrom(Model model) {
		
		Student student = new Student();
		model.addAttribute("student",student);
		return  "create_student";
	}
	
	@PostMapping("/students") // save the student Data
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}") // Return edit_student view
	public String editStudetForm(@PathVariable Long id, Model model ) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("students/{id}") // Modify student data
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
		
	Student existingStudent = studentService.getStudentById(id);
	existingStudent.setId(id);
	existingStudent.setFirstName(student.getFirstName());
	existingStudent.setLastName(student.getLastName());
	existingStudent.setEmail(student.getEmail());
	
	studentService.updateStudent(existingStudent);
	return "redirect:/students";
	
	}
	
	@GetMapping("students/{id}") // Delete student data
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
