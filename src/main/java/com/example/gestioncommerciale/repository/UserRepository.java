package com.example.gestioncommerciale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<com.example.gestioncommerciale.entities.User,Long> {
    boolean existsByLogin(String login);

}