package com.elite.kvijay9.controller;

import com.elite.kvijay9.model.Student;
import com.elite.kvijay9.service.StudentService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(name = "id") Long id) {
        return studentService.getStudentById(id);
    }

    // http://localhost:8080/api/v1/student GET
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(HttpServletRequest request) {
        String city = request.getParameter("city");
        // 1 param
        // read multiple params
        // List<Object>
        return studentService.getAllStudentsByCity(city);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteStudentById(@PathVariable(name = "id") Long id) {
         // comment has been added
         studentService.deleteStudentById(id);
         return "deleted";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Student updateStudentById(@PathVariable(name = "id") Long id, @RequestBody Student student) {
        // comment has been added
        return studentService.updateStudentById(id, student);
    }
}
