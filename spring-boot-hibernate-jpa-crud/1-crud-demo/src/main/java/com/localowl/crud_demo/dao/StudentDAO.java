package com.localowl.crud_demo.dao;

import com.localowl.crud_demo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer studentId);
}
