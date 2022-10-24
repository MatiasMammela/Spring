package com.example.testspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testspring.data.Courses;
import com.example.testspring.data.OnlineCourses;

@Service
public class CourseService {
    public List<OnlineCourses> courses = new ArrayList<>();

    // adding courses to the "courses" list
    public String addCourses(String name, String teacher, String url) {
        OnlineCourses course = new OnlineCourses(name, teacher, url);
        courses.add(course);
        return "Added a Course!";

    }

    // getting courses by their id from the "courses" list
    public List<OnlineCourses> getCourses(int id) {
        List<OnlineCourses> foundCourses = new ArrayList<>();
        try {
            for (OnlineCourses c : courses) {
                if (c.getId() == id) {
                    foundCourses.add(c);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return foundCourses;
    }

    // Getting all the courses from the "courses" list
    public List<OnlineCourses> getAllCourses() {
        System.out.println(courses);
        return courses;
    }

    @Autowired
    StudentService sService;

    // adding students to "courses" list
    public String addStudentToCourse(int studentid, int courseid) {

        if (sService.getStudents(studentid) != null) { // check if the student exists

            for (Courses course : courses) { // check if the course exists
                if (course.getId() == courseid) {
                    course.addParticipantsStudent(studentid);
                    return "Student added to course!";
                }
            }
            return "No found courses!";
        }
        return "No found students!";
    }

}
