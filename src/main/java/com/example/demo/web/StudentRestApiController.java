package com.example.demo.web;


import com.example.demo.dao.entities.Student;
import com.example.demo.services.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*http://localhost:9000/api/v1/students*/
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/students")
public class StudentRestApiController {

private final IStudentService iStudentService;

@PostMapping
    public Student creerEtudiant(@RequestBody Student student){

               try {
                   this.iStudentService.ajouterEtudiant(student);
                   return student;
               }catch (Exception e){
                    new Exception("Erreur creer etudiant");
               }
return  null;
}

@GetMapping
    public List<Student>getAllStudents(){
    try {

        return this.iStudentService.chercherListEtudiant();
    }catch (Exception e){
        new Exception("Erreur trouver liste etudiant");
    }
    return  null;

}

@GetMapping("/{motCle}")
    public List<Student>getStudentsByKeyword(@PathVariable(name="motCle") String motCle){
    try {

        return this.iStudentService.trouverListEtudiantsParMotCle(motCle);
    }catch (Exception e){
        new Exception("Erreur trouver liste etudiant");
    }
    return  null;

}


    @DeleteMapping("/{id}")
    public Student supprimerEtudiant(@PathVariable(name= "id") Long id){
        try {

            return this.iStudentService.supprimerEtudiant(id);
        }catch (Exception e){
            new Exception("Erreur trouver  etudiant");
        }
        return  null;

    }

    @PutMapping
    public Student modiferEtudiant(@RequestBody Student student){
                try {
                    this.iStudentService.modifierEtudiant(student);
                    return student;
                }catch(Exception e){

                    new Exception("Erreur modifer  etudiant");

                }

        return null;
    }
}
