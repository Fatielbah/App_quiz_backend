package com.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.entity.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse, Long> {
    
}

