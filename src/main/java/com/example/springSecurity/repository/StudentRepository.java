package com.example.springSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springSecurity.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

    
    

}
