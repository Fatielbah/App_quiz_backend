package com.emsi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String sujet;
    private String niveau;
    private int duree;
    private String reference;
    private String qrCode;
    private int nbreTentatives;
    private String type;
    private LocalDateTime dateCreation;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;

    @OneToMany(mappedBy = "quiz")
    private List<Participation> participations;

    @OneToOne
    private Rapport rapport;

    @ManyToMany(mappedBy = "quizzes")
    private List<Groupe> groupes;

}

