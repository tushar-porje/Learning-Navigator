package com.code_a_thon.learning_navigator.subject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code_a_thon.learning_navigator.subject.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject,Integer>{
    
}
