package com.esprit.gestionfoyenourba.Repository;

import com.esprit.gestionfoyenourba.Entity.Bloc;
import com.esprit.gestionfoyenourba.Entity.Chambre;
import com.esprit.gestionfoyenourba.Entity.Reservation;
import com.esprit.gestionfoyenourba.Enum.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface BlocRepo extends JpaRepository<Bloc, Long> {

//public Set<Bloc> findBlocByChambresTypeChamber(TypeChambre typeChambre);


}
