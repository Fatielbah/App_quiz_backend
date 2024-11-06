package com.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.entity.Rapport;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Long> {
    
}
