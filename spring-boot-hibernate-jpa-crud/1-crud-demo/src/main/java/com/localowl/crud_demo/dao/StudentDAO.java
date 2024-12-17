package com.localowl.crud_demo.dao;

import com.localowl.crud_demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer studentId);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student theStudent);
}
