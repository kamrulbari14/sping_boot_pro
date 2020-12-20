package com.springbootdemo.lectureone.dto;

import com.springbootdemo.lectureone.model.Course;
import lombok.Data;

@Data
public class StudentDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String birthday;
    private Course course;

}
