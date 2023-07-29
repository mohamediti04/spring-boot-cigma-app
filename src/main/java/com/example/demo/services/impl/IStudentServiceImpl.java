package com.example.demo.services.impl;

import com.example.demo.dao.entities.Student;
import com.example.demo.dao.repositories.StudentRepo;
import com.example.demo.services.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IStudentServiceImpl  implements IStudentService {

    private final StudentRepo studentRepo;
    @Override
    public Student ajouterEtudiant(Student student) throws Exception {
        return this.studentRepo.save(student);
    }

    @Override
    public Student modifierEtudiant(Student student) throws Exception {
        return this.studentRepo.save(student);
    }

    @Override
    public Student supprimerEtudiant(Long id) throws Exception {
        Student student=this.chercherEtudiant(id);
        this.studentRepo.deleteById(id);
        return student;
    }

    @Override
    public Student supprimerEtudiant(Student student) throws Exception {
        this.studentRepo.delete(student);
        return student;
    }

    @Override
    public List<Student> chercherListEtudiant() throws Exception {
        return this.studentRepo.findAll();
    }

    @Override
    public Student chercherEtudiant(Long id) throws Exception {
        if(this.studentRepo.findById(id).isPresent())
        return studentRepo.findById(id).get();
        else
             throw  new RuntimeException("Not found");
    }

    @Override
    public List<Student> trouverListEtudiantsParMotCle(String motCle) throws Exception {
        return this.studentRepo.findBykeyWord(motCle);
    }


}
