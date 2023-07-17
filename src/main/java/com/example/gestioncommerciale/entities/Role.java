package com.example.gestioncommerciale.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "role", schema = "Administration")
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String label;

    @ManyToMany(mappedBy = "roles")
    private List<Functionality> functionalities = new ArrayList<>();
}