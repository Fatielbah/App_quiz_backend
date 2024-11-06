package com.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
