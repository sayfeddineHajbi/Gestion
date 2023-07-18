package com.example.gestioncommerciale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<com.example.gestioncommerciale.entities.Role,Long> {


}
