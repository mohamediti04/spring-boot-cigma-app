package com.example.demo.services;

import com.example.demo.dao.entities.Student;

import java.util.List;

public interface IStudentService {

    Student ajouterEtudiant(Student student) throws Exception;
    Student modifierEtudiant(Student student) throws  Exception;
    Student supprimerEtudiant(Long id) throws  Exception;
    Student supprimerEtudiant(Student student) throws  Exception;
    List<Student> chercherListEtudiant() throws Exception;
    Student chercherEtudiant(Long id) throws Exception;
    List<Student>trouverListEtudiantsParMotCle(String motCle) throws  Exception;

}
