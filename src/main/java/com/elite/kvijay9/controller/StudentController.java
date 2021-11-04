package com.elite.kvijay9.controller;

import com.elite.kvijay9.model.Student;
import com.elite.kvijay9.service.StudentService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/student")
public class StudentController {

    // Dependency injection || inversion dependency
    @Autowired
    private StudentService studentService;

    @PostMapping
    public String createStudent(@RequestBody Student student) throws SQLException {
        return studentService.createStudent(student);
    }

    @GetMapping
    public Student getStudentById() throws SQLException {
        //studentService.getStudent(null);
        return null;
    }
}
