package com.emsi.quiz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String username;
    private String email;
    private String password;
    private String image;

    @ManyToMany
    @JoinTable(
        name = "utilisateur_groupe",
        joinColumns = @JoinColumn(name = "utilisateur_id"),
        inverseJoinColumns = @JoinColumn(name = "groupe_id")
    )
    private List<Groupe> groupes;

    @OneToMany(mappedBy = "utilisateur")
    private List<Participation> participations;

   
    @OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Rapport rapport;
    
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<Notification> notifications;

}