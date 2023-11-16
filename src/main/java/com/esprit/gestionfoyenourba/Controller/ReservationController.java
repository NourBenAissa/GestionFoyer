package com.esprit.gestionfoyenourba.Controller;

import com.esprit.gestionfoyenourba.Entity.Reservation;
import com.esprit.gestionfoyenourba.Service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;
    @GetMapping
    public List<Reservation> retrieveAllFoyers() {
        return reservationService.retrieveAllReservation();
    }


    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation r) {
        return reservationService.updateReservation(r);
    }

    @GetMapping("{idReservation}")
    public Reservation retrieveReservation(@PathVariable long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }



}
