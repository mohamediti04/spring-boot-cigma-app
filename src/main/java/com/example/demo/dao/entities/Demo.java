package com.example.demo.dao.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String labelle ;
}
