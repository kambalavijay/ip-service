package com.elite.kvijay9.service;

import com.elite.kvijay9.model.Student;
import com.elite.kvijay9.repository.StudentRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String createStudent(Student student) throws SQLException {
        studentRepository.save(student);
        return "student record created successfully";
    }

    public Student getStudent(Long id) throws SQLException {
        return null;
    }
}
