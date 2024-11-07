package com.emsi.quiz.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Reponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texte;
    private boolean estCorrecte;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    
}

