package com.localowl.crud_demo.entity;

import jakarta.persistence.*;

@Entity //Map class to database table
@Table(name = "student") //the use of @Table is optional - if not specified, the table name is the same name as Java table
public class Student {
    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // GenerationType.IDENTITY -> Assign primary keys using database identity
    @Column(name = "id") //the use of @Column is optional - if not specified, the column name is the same name as Java field
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    //define constructor
    public Student (){}
    public Student(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //define getter/setter -> Encapsulation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //define toString() method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
