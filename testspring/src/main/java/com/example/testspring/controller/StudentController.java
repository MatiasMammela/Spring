package com.example.testspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testspring.data.Students;
import com.example.testspring.service.StudentService;

@RestController
public class StudentController implements StudentInterface {
    @Autowired
    StudentService sService;

    @GetMapping("getStudentInfo")
    public List<Students> getStudents(@RequestParam Integer id) {
        return sService.getStudents(id);
    }

    @GetMapping("Allstudents")
    public List<Students> getAllStudents() {

        return sService.getAllStudents();

    }

    @PostMapping("addStudents")
    public String addStudents(@RequestParam String name, @RequestParam int age) {
        return sService.addStudents(name, age);
    }

}
