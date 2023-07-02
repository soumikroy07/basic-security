package com.basic.security.basic.controller;

import com.basic.security.basic.model.Student;
import com.basic.security.basic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(path = "/")
    public List<Student> getAllStudents(){
        return this.service.getAllStudents();
    }

    @GetMapping(path = "/{name}")
    public Student getSingleStudent(@PathVariable(name = "name") String studentName){
        return this.service.getAStudent(studentName);
    }

    @PostMapping(path = "/")
    public Student createStudent(@RequestBody Student student){
        this.service.addStudent(student);
        return student;
    }

}
