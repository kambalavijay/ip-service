package com.elite.kvijay9.service;

import com.elite.kvijay9.model.Student;
import com.elite.kvijay9.repository.StudentRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        // comment has been added
        return studentRepository.save(student); // insert
    }

    public Student getStudentById(Long id) {
        // comment has been added
        return studentRepository.getById(id); // select * from student where id = ?
    }

    public List<Student> getAllStudents() {
        // comment has been added
        return studentRepository.findAll();
        // select * from employee
    }

    public List<Student> getAllStudentsByCity(String city) {
        // comment has been added
        return studentRepository.getAllByCityEquals(city);
        // select * from employee where city=?;
    }

    public void deleteStudentById(Long id) {
        // comment has been added
        studentRepository.deleteById(id);
    }

    public Student updateStudentById(Long id, Student student) {
        student.setId(id);
        // comment has been added
        return studentRepository.save(student);
    }

}
