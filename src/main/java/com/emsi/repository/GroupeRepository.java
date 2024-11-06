package com.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.entity.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
    
}
