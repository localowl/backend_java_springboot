package com.localowl.crud_demo.dao;

import com.localowl.crud_demo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository /*Specialized annotation for repositories
Supports component scanning
Translate JDBC exceptions
*/
public class StudentDAOImpl implements StudentDAO{
    //If you need low-level control and flexibility, use EntityManager
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //Automatically begin and end a transaction for your Jpa code
    public void save(Student theStudent) {
        entityManager.persist(theStudent); //saves the student
    }

    @Override
    public Student findById(Integer studentId) {
        return entityManager.find(Student.class, studentId);
    }


}
