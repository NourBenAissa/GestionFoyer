package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Reservation;
import com.esprit.gestionfoyenourba.Repository.ChambreRepo;
import com.esprit.gestionfoyenourba.Repository.EtudiantRepo;
import com.esprit.gestionfoyenourba.Repository.ReservationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationImp implements ReservationService{

    private final ReservationRepo reservationRepo;
    private final EtudiantRepo etudiantRepo;
    private final ChambreRepo chambreRepo;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return reservationRepo.findById(idReservation).orElse(null);
    }

    @Override
    public Reservation addReservation(Long idChamber, Long cinEtuiant) {

        return null;
    }

    @Override
    public Reservation annulerReservation(Long cinEtudiant) {

        return null;
    }
}
