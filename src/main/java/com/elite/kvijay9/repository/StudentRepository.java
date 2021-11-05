package com.elite.kvijay9.repository;

import com.elite.kvijay9.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// jpa -> boss I am dealing student table help me with connection, in built queries and statemnet
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student getById(Long id); // select * from student where id = ?
}
