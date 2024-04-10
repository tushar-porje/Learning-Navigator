package com.code_a_thon.learning_navigator.student.entity;

import java.util.List;

import com.code_a_thon.learning_navigator.exam.entity.Exam;
import com.code_a_thon.learning_navigator.subject.entity.Subject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {
    // Student Registration ID (Unique Identifier)
    // Student Name
    // List of enrolled Subjects
    // List of registered Exams
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private Integer id;

    private String name;

    @ManyToMany
    @JoinTable(name = "student_subject_mapping", joinColumns = @JoinColumn(name = "student_id" ,referencedColumnName = "id"),
                                                 inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"))
    private List<Subject> subjects;

    @ManyToMany
    @JoinTable(name = "student_exam_mapping", joinColumns = @JoinColumn(name = "student_id" ,referencedColumnName = "id"),
                                                 inverseJoinColumns = @JoinColumn(name = "exam_id" ,referencedColumnName = "id"))
    private List<Exam> exams;

}
