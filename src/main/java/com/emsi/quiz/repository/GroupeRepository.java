package com.emsi.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.quiz.entity.Groupe;



@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
    
}
