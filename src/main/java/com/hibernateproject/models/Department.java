package com.hibernateproject.models;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Serdeable
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
