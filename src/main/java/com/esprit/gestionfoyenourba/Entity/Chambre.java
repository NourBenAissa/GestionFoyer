package com.esprit.gestionfoyenourba.Entity;


import com.esprit.gestionfoyenourba.Enum.TypeChambre;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    long numeroChambre;

    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;

    @ManyToOne
    @JoinColumn(name = "idBloc")
    Bloc bloc;

    @OneToMany
    Set<Reservation> reservations;

}
