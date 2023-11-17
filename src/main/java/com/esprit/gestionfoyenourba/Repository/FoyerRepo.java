package com.esprit.gestionfoyenourba.Repository;

import com.esprit.gestionfoyenourba.Entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FoyerRepo extends JpaRepository<Foyer,Long> {

    public Foyer findByNomFoyer(String nom);
}
