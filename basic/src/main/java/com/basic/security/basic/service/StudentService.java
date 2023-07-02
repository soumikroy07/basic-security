package com.basic.security.basic.service;

import com.basic.security.basic.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    public StudentService(){
        students.add(new Student("Diya", 2, 69));
        students.add(new Student("miki", 1, 50));
        students.add(new Student("ciki", 3, 60));
        students.add(new Student("mikkki", 1, 55));
        students.add(new Student("Shrestha", 1, 40));
        students.add(new Student("Somo", 2, 90));
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getAStudent(String studentName){
        return students.stream().filter(student -> student.getName().equalsIgnoreCase(studentName)).findAny().orElse(null);
    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }
}
