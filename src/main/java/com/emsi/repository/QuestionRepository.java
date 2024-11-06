package com.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    
}

