package com.example.gestioncommerciale.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "functionality", schema = "Administration")
public class Functionality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")

    private String code;

    @Column(name = "label")

    private String label;

    @Column(name = "path")

    private String path;

    @Column(name = "icon")

    private String icon;

    @Column(name = "idparent")

    private String idParent;



@ManyToMany
@JoinTable(name = "func_roles",joinColumns = @JoinColumn(name = "functionalit_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
private List<Role>roles=new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "func_profil",joinColumns = @JoinColumn(name = "functionality_id"),inverseJoinColumns = @JoinColumn(name = "profil_id"))
    private List<Profil>profils=new ArrayList<>();

}
