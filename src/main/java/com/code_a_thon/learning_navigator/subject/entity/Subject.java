package com.code_a_thon.learning_navigator.subject.entity;

import java.util.List;

import com.code_a_thon.learning_navigator.exam.entity.Exam;
import com.code_a_thon.learning_navigator.student.entity.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Subject {    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "subject")
    private List<Exam> exam;

    @ManyToMany(mappedBy = "subjects")
    private List<Student> students;
}
