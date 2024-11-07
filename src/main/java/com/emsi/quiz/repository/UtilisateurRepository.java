package com.emsi.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.quiz.entity.Utilisateur;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
