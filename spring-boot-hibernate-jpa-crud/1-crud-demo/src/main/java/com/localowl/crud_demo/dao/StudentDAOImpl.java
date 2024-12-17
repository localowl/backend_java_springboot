package com.localowl.crud_demo.dao;

import com.localowl.crud_demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Student> findAll() {
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by firstName asc", Student.class);
        //return query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> queryByLastName = entityManager.createQuery(
                "FROM Student WHERE lastName=:theData", Student.class);

        //set query parameters
         queryByLastName.setParameter("theData", theLastName);

         return queryByLastName.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }


}
