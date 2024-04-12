package com.code_a_thon.learning_navigator.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code_a_thon.learning_navigator.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
