package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


import java.util.List;

@Entity
public class Person {


@Id
private Long id;
private String name;
private String lastname;
@OneToMany
private List<Phone> phones ;
}
