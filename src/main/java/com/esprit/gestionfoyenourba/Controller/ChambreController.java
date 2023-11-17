package com.esprit.gestionfoyenourba.Controller;

import com.esprit.gestionfoyenourba.Entity.Chambre;
import com.esprit.gestionfoyenourba.Enum.TypeChambre;
import com.esprit.gestionfoyenourba.Service.ChambreImp;
import com.esprit.gestionfoyenourba.Service.ChambreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@RequiredArgsConstructor
public class ChambreController {

    private final ChambreService chambreService;

    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/{idChambre}")
    public Chambre getChambreById(@PathVariable Long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }


    @GetMapping("/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable Long idBloc, @PathVariable TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }
}
