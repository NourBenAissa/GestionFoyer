package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Bloc;

import java.util.List;

public interface BlocService {

    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc getBlocById (long idBloc);

    void removeBloc (long idBloc);

    Bloc affecterChambresABloc(List<Long> idChambre, Long idBloc);
    Bloc affecyerBlocAFoye(Long idBloc, Long idFoyer);
}
