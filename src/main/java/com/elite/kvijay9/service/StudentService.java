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
        return studentRepository.save(student); // insert
    }

    public Student getStudentById(Long id) {
        return studentRepository.getById(id); // select * from student where id = ?
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudentById(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

}
