package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Bloc;

import java.util.List;

public interface BlocService {

    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long idBloc);

    void removeBloc (long idBloc);
}
