package com.example.testspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.*;

import com.example.testspring.data.OnlineCourses;
import com.example.testspring.data.Students;

@Service
public class fileservice {

    @Autowired
    StudentService sService;

    @Autowired
    CourseService cService;
    private static File file = new File("testspring/src/main/resources/public/snapshot.txt");

    public void ExportToFile() throws IOException {// Export all the current data to the file
        FileWriter fw = new FileWriter(file, false);
        fw.write("");
        for (Students s : sService.getAllStudents()) {// Find all the students and write them to the file.
            fw.write("Student :  NAME " + s.getName() + " , ID " + s.getId() + " , AGE " + s.getAge()
                    + System.lineSeparator());
        }
        for (OnlineCourses c : cService.getAllCourses()) {// Find all the courses and write them to the file.
            fw.write("Course :  NAME " + c.getName() + " , ID " + c.getId() + " , TEACHER " + c.getTeacher()
                    + " , URL " + c.getUrl() + " , PARTICIPANTS ID's " + c.Participants
                    + System.lineSeparator());
        }
        fw.close();
    }
}
