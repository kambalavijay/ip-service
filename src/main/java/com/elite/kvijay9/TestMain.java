package com.elite.kvijay9;


import com.elite.kvijay9.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMain{

    public static void main(String args[]) throws Exception {

        Student student = new Student();
        student.setId(1L);
        student.setFirstName("A");
        student.setLastName("B");
        student.setEmail("ab@gmail.com");
        student.setCity("ABCity");

        StringBuilder query = new StringBuilder();
        query.append("insert into student values (");
        query.append(student.getId()+", ");
        query.append("'" + student.getFirstName()+"', ");
        query.append("'" + student.getLastName()+"', ");
        query.append("'" + student.getEmail()+"', ");
        query.append("'" + student.getCity()+"')");

        System.out.println(query);
    }
}