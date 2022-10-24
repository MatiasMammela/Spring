package com.example.testspring.controller;

import java.util.List;

import com.example.testspring.data.Students;

interface StudentInterface {
    List<Students> getAllStudents();

    List<Students> getStudents(Integer id);

    String addStudents(String name, int age);

}