package com.code_a_thon.learning_navigator.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code_a_thon.learning_navigator.exam.entity.Exam;


public interface ExamRepository extends JpaRepository<Exam,Integer>{
    
}
