package com.example.springSecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springSecurity.entity.Student;
import com.example.springSecurity.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student student){
        Optional<Student> existing = studentRepository.findById(id);

        if(existing.isPresent()){
            Student existingStudent = existing.get();
            existingStudent.setRno(student.getRno());
            existingStudent.setName(student.getName());
            existingStudent.setDept(student.getDept());
            return studentRepository.save(existingStudent);
        } else {
            throw new RuntimeException("Student with id " + id + " not found");
        }
        
    }

}
