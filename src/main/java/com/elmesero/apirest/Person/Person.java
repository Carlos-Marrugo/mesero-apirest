package com.elmesero.apirest.Person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String name;
    private String lastName;
    private String emai;

    public Person(Integer id, String name, String lastName, String emai) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.emai = emai;
    }

    // Getters and Setters
}
