package com.example.zuulstudentapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {

    private String fName;
    private String lName;
    private int age;
}
