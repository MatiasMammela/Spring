package com.example.testspring.data;

import java.util.ArrayList;
import java.util.List;

public abstract class Courses {

    public String name;
    public String teacher;
    public int id;
    public static int idcount = 0;
    public List<Integer> Participants = new ArrayList<>(); // Paricipants for the course

    public Courses(String name, String teacher) {
        this.id = idcount++;// Auto increment id's when new object is created
        this.name = name;
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getParticipants() {
        return this.Participants;
    }

    public void addParticipantsStudent(Integer id) {
        this.Participants.add(id);
    }
}
