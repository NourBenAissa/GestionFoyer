package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Foyer;

import java.util.List;

public interface FoyerService {

    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer (long idFoyer);
}
