package com.emsi.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.quiz.entity.Participation;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, Long> {
}
