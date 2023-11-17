package com.esprit.gestionfoyenourba.Controller;


import com.esprit.gestionfoyenourba.Entity.Bloc;
import com.esprit.gestionfoyenourba.Entity.Foyer;
import com.esprit.gestionfoyenourba.Service.BlocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bloc")
@RequiredArgsConstructor
public class BlocController {

private final BlocService blocService;

@GetMapping
public List<Bloc> retreiveAllBlocs(){
    return blocService.retrieveBlocs();

}

@PostMapping
public Bloc addBloc(@RequestBody Bloc b){
    return blocService.addBloc(b);
}




    @PutMapping
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("/all")
    public List<Bloc> retrieveBlocs() {
        return blocService.retrieveBlocs();
    }

    @GetMapping("/{idBloc}")
    public Bloc getBlocById(@PathVariable Long idBloc) {
        return blocService.getBlocById(idBloc);
    }

    @DeleteMapping("/delete/{idBloc}")
    public void removeBloc(@PathVariable Long idBloc) {
        blocService.removeBloc(idBloc);
    }


    @PutMapping("/affecterChambres/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> idChambre, @PathVariable Long idBloc) {
        return blocService.affecterChambresABloc(idChambre, idBloc);
    }
    @PutMapping("/affecterBlocFoyer/{idBloc}/{idFoyer}")
    public Bloc affecterBlocAFoyer(@PathVariable Long idBloc, @PathVariable Long idFoyer) {
        return blocService.affecyerBlocAFoye(idBloc, idFoyer);
    }

}
