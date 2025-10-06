package com.app.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return studentRepo.findAll();

    }

    @RequestMapping("/addStudent")
    public Student addStudent() {
        Student student = new Student("Vicky",22);
        return studentRepo.save(student);
    }
}
