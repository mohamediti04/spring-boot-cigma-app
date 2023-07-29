package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepo  extends JpaRepository<Student,Long>{
//right just no defined Spring Data JPA method  or HQl
    List<Student> findAllByName(String name);
    @Query("from Student  s where s.name like %:keyword%")
    List<Student> findBykeyWord(String keyword);

}
