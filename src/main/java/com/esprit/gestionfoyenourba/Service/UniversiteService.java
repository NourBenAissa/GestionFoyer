package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Universite;

import java.util.List;

public interface UniversiteService {

    List<Universite> retrieveAllUniversities();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (long idUniversite);
}
