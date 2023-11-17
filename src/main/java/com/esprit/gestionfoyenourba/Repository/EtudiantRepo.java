package com.esprit.gestionfoyenourba.Repository;

import com.esprit.gestionfoyenourba.Entity.Etudiant;
import com.esprit.gestionfoyenourba.Entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {

Etudiant findEtudiantByCin(Long cin);
}
