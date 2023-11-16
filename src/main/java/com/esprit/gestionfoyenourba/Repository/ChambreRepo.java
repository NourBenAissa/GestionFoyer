package com.esprit.gestionfoyenourba.Repository;

import com.esprit.gestionfoyenourba.Entity.Chambre;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ChambreRepo extends CrudRepository<Chambre,Long> {

    public Set<Chambre> findChambreByBlocs_NomBloc(String bloc);
}
