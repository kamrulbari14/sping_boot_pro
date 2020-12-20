package com.springbootdemo.lectureone.controller;

import com.springbootdemo.lectureone.dto.StudentDto;
import com.springbootdemo.lectureone.model.Course;
import com.springbootdemo.lectureone.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/create")
    public String createStudent(Model model){
        model.addAttribute("student", new StudentDto());
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("java"));
        courseList.add(new Course("python"));
        courseList.add(new Course("c++"));
        model.addAttribute("courses", courseList);
        return "demo";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute StudentDto student, Model model){
        System.out.println(student.getFirstName());
        LocalDate birthday = LocalDate.parse(student.getBirthday(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Student student1 = new Student();
        student1.setBirthday(birthday);
        System.out.println(student1.getBirthday());
        System.out.println(student.getCourse());
        model.addAttribute("student", new StudentDto());
        return "demo";
    }

}
