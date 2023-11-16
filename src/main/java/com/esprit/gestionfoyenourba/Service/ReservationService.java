package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);

    Reservation retrieveReservation (long idReservation);
}
