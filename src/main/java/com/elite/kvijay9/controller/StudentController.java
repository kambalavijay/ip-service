package com.elite.kvijay9.controller;

import com.elite.kvijay9.model.Student;
import com.elite.kvijay9.service.StudentService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/student")
public class StudentController {

    // Dependency injection || inversion dependency
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(name = "id") Long id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteStudentById(@PathVariable(name = "id") Long id) {
         studentService.deleteStudentById(id);
         return "deleted";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Student updateStudentById(@PathVariable(name = "id") Long id, @RequestBody Student student) {
        return studentService.updateStudentById(id, student);
    }


// api/v1/student -> post
// api/v1/student/{id} -> get particular student
// api/v1/student -> get
// api/v1/student/{id} -> delete
// api/v1/student/{id} -> put, requestbody



    // getstudentbyid -> get
    // getallstudent -> get
    // updatestudentbyid -> put
    // deletestudentbyid -> delete
}
