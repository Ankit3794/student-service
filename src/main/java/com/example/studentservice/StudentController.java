package com.example.studentservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return StudentRepository.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return StudentRepository.getStudent(id);
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return StudentRepository.addStudent(student);
    }

}
