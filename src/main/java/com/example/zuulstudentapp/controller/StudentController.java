package com.example.zuulstudentapp.controller;

import com.example.zuulstudentapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping(value = "/get")
    public Student getStudent(){
        return new Student("Paul","Smith",35);
    }

}
