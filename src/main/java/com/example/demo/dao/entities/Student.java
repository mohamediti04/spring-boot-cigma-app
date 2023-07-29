package com.example.demo.dao.entities;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Student {

    @Id
    @SequenceGenerator(name = "seq1",sequenceName = "seq1", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq1")
    private Long id;
    private String name;
   // @Column(unique = false)
    private String telephone;



}
