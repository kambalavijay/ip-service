package com.elite.kvijay9;


import com.mysql.cj.util.StringUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class TestUUID {
    public static void main(String[] args) throws SQLException {


        /*
        Student s1 = new Student(2, "B", "bca@gmail.com", "231", "18-08-1994", 85);
        Student s2 = new Student(3, "C", "cab@gmail.com", "321", "18-08-1995", 85);
        */
        Map<Student, Integer> map = new HashMap<>();
        for (int i = 0; i < 16; i++) {
            Student s = new Student(i, "A"+i, "abc@gmail.com"+i, "123"+i, "18-08-1993"+i, 85);
            map.put(s, s.getId());
        }

        for (int i = 16; i < 32; i++) {
            Student s = new Student(i, "A"+i, "abc@gmail.com"+i, "123"+i, "18-08-1993"+i, 85);
            map.put(s, s.getId());
        }




    }
}