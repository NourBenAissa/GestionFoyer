package com.esprit.gestionfoyenourba.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReservation;

    Date anneeUniversitaire;
    boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    Set<Etudiant> etudiants;
}