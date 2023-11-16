package com.esprit.gestionfoyenourba.Repository;

import com.esprit.gestionfoyenourba.Entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepo extends CrudRepository<Reservation,Long> {
}
