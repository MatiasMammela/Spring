package com.example.testspring.data;

public class OnlineCourses extends Courses {

    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OnlineCourses(String name, String teacher, String url) {
        super(name, teacher);
        this.url = url;
    }
}
