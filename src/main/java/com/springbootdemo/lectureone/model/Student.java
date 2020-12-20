package com.springbootdemo.lectureone.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private LocalDate birthday;
    private Course course;
}
