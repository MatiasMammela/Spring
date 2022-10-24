package com.example.testspring.data;

import java.io.Serializable;

public class Students implements Serializable {
    private String name;
    private int age;
    private int id;
    private static int idcount = 0;

    public Students(String name, int age) {
        this.id = idcount++;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
