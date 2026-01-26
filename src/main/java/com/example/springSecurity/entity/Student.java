package com.example.springSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key
    private Long id;
    private String rno;
    private String name;
    private String dept;


    public Student(){}

    public Student(String rno, String name, String dept){
        this.rno = rno;
        this.name = name;
        this.dept = dept;
    }


    public String getRno(){
        return rno;
    }

    public void setRno(String rno){
        this.rno = rno;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    } 

    public String getDept(){
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    



}
