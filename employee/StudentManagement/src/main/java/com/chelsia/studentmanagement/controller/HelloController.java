package com.chelsia.studentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chelsia.studentmanagement.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/student")
    public String student() {
        return "Chelsia";
    }

    @GetMapping("/college")
    public String college() {
        return "ABC Engineering College";
    }

    @GetMapping("/course")
    public String course() {
        return "Java Course";
    }

    @GetMapping("/city")
    public String city() {
        return "Chennai";
    }

    @GetMapping("/studentdetails")
    public Student studentDetails() {
        return new Student(101, "Chelsia", "CSE");
    }

    //@GetMapping("/{id}")
    //public String getStudent(@PathVariable int id) {
    //    return "Student ID: " + id;
    //}

    @GetMapping("/course/{name}")
    public String name(@PathVariable String name){
        return "Course name: " + name;
    }

    @GetMapping("/search")
    public String searchStudent(@RequestParam int id) {
        return "Student ID: " + id;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return student;
    }

}