package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Chambre;
import com.esprit.gestionfoyenourba.Enum.TypeChambre;

import java.util.List;

public interface ChambreService {

    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);

    List<Chambre> getChambresParBlocEtType (Long idBloc, TypeChambre typeC);
}
