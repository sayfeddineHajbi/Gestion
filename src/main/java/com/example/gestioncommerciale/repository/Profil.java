package com.example.gestioncommerciale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Profil extends JpaRepository<com.example.gestioncommerciale.entities.Profil,Long> {
}
