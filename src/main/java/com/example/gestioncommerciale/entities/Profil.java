package com.example.gestioncommerciale.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "profil", schema = "Administration")
public class Profil {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String label;

    @ManyToMany(mappedBy = "profils")
    private List<Functionality> functionalities = new ArrayList<>();
}
