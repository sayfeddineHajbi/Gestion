package com.example.gestioncommerciale.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "user", schema = "Administration")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String login;
    private String password;
    private Boolean isActivated;
    private Date dtExpiration;
    private Date CreatedAt;
    private String CreatedBy;
    private Date ModifiedAt;
    private String ModifiedBy;

    @OneToOne
    @JoinColumn(name = "roles_id")
    private Role role;

//    @OneToOne
//    @JoinColumn(name = "profil_id")
//    private Profi profil;
}