package com.example.testspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testspring.data.OnlineCourses;
import com.example.testspring.service.CourseService;

@RestController
public class CourseController implements CourseInterface {

    @Autowired
    CourseService cService;

    @GetMapping("Allcourses")
    public List<OnlineCourses> getAllCourses() {
        return cService.getAllCourses();
    }

    @PostMapping("addCourses")
    public String addCourses(@RequestParam String name, @RequestParam String teacher, @RequestParam String url) {
        return cService.addCourses(name, teacher, url);
    }

    @PostMapping("AddstudentToCourse")
    public String addStudentToCourse(@RequestParam int studentid, @RequestParam int courseid) {
        return cService.addStudentToCourse(studentid, courseid);
    }

}
