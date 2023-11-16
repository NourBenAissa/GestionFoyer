package com.esprit.gestionfoyenourba.Repository;

import com.esprit.gestionfoyenourba.Entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepo extends CrudRepository<Reservation,Long> {

    public Reservation findByIdReservation(String idR);
    public Reservation findByEtudiantsNom(String nom);

    List<Reservation> findByEtudiantsnNomStartsWith(String prefix);
}
