package com.example.springSecurity.DemoController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.entity.Student;
import com.example.springSecurity.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class StudentController {


    @Autowired
    StudentService studentService;
    
    // List<Student> students = new ArrayList<>(List.of(
    //     new Student ("1","sanjay","IT"),
    //     new Student("2","vijay","IT")
    //     ));

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentService.getStudents();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) { 
        return studentService.addStudent(student) ;
    
    }

    @PutMapping("/student/{id}")
    public Student putMethodName(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id,student );
    }


}
