package com.elite.kvijay9.repository;

import com.elite.kvijay9.model.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// jpa -> boss I am dealing student table help me with connection, in built queries and statemnet
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student getById(Long id); // select * from student where id = ?

    List<Student> getAllByCityEquals(String city);
    // select * from student where city=?;

    List<Student> getAllByCityAndAndEmailAndFirstName(String city, String email, String firstName);
    // select * from student where city=? and email=? and firstName=?;
}
