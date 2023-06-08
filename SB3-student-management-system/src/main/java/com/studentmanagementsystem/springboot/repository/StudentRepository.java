package com.studentmanagementsystem.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagementsystem.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
