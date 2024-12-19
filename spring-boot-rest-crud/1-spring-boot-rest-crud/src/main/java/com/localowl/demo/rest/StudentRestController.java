package com.localowl.demo.rest;

import com.localowl.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {
    private List<Student> theStudents;

    //define @PostConstruct to load the student data only once
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Kath", "Lock"));
        theStudents.add(new Student("Kylie", "Jack"));
    }
    //define endpoints for "/students"
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    //define endpoints "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        //check the studentId
        if(studentId >= theStudents.size() || studentId<0){
            throw new StudentNotfoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }


}
