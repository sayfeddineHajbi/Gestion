package com.example.gestioncommerciale.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "personnel",schema = "Administration")
public class Personnel {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private Date dtNaissance;
    private String Telephone;
    private String Address;
    private Long NCss;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
