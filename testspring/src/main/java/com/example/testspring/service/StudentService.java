package com.example.testspring.service;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.testspring.data.Students;

@Service
public class StudentService implements Serializable {

    private List<Students> students = new ArrayList<>();

    // Adding students to the "students" list
    public String addStudents(String name, int age) {
        Students student = new Students(name, age);
        students.add(student);
        return "Added a Student!";
    }

    // Getting students by their id from the "students" list
    public List<Students> getStudents(int studentID) {

        List<Students> foundStudents = new ArrayList<>();

        for (Students s : students) {
            if (s.getId() == studentID) {
                foundStudents.add(s);
            } else {
                return null;
            }
        }
        return foundStudents;
    }

    // Getting all the students from the "students" list
    public List<Students> getAllStudents() {
        return students;
    }
}
