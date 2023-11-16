package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Etudiant;

import java.util.List;

public interface EtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    List<Etudiant> addEtudiants (List<Etudiant> etudiants);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(long idEtudiant);

    void removeEtudiant(long idEtudiant);
}
