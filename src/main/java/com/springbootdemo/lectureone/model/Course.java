package com.springbootdemo.lectureone.model;

import lombok.Data;

@Data
public class Course {
    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    private String name;
}
