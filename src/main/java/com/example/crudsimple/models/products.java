package com.example.crudsimple.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class products {

    @Id
    public int id;

    public String name;


}
