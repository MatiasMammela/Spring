package com.example.testspring.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testspring.service.fileservice;

@RestController
public class FileController implements FileInterface {
    @Autowired
    fileservice fService;

    @PostMapping("snapshot")
    public String CreateASnapshot() throws IOException {
        fService.ExportToFile();
        return "Snapshot of current data saved to snapshot.txt";

    }

}
