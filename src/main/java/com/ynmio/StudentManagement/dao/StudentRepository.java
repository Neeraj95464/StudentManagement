package com.ynmio.StudentManagement.dao;

import com.ynmio.StudentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}