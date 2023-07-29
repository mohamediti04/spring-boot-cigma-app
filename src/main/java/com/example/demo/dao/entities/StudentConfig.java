package com.example.demo.dao.entities;


import com.example.demo.dao.entities.Student;
import com.example.demo.dao.repositories.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class StudentConfig {
    private final   StudentRepo studentRepo;
//@Bean
CommandLineRunner initStudentDb(){
    Student s=new Student();
    s.setId(null);
    s.setName("Ali");

    s.setTelephone("06769jj319");

return args -> {
    this.studentRepo.save(
       s
    );
    studentRepo.findAll().forEach(System.out::println);
    List<Student>students=studentRepo.findAllByName("Ali");
    System.out.println(students.get(0));
};

}

}





