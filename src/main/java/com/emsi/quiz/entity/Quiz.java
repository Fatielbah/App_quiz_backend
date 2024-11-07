package com.emsi.quiz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String sujet;
    private String niveau;
    private int duree;
    private boolean estPublic;
    private String codeAcces;
    private String reference;
    private String qrCode;
    private int nbreTentatives;
    private String type;
    private LocalDateTime dateCreation;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;

    @OneToMany(mappedBy = "quiz" , cascade = CascadeType.ALL)
    private List<Participation> participations;

    @OneToMany(mappedBy="quiz", cascade = CascadeType.ALL)
    private List<Rapport> rapports;

    @ManyToMany(mappedBy = "quizzes")
    private List<Groupe> groupes;
    
    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Classement> classements;
    
}

