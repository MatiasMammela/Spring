package com.example.testspring.controller;

import java.util.List;
import com.example.testspring.data.OnlineCourses;

interface CourseInterface {

    List<OnlineCourses> getAllCourses();

    String addCourses(String name, String teacher, String url);

    String addStudentToCourse(int studentid, int courseid);
}
