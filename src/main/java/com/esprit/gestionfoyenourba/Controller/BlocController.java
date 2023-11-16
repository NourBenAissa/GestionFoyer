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

    @GetMapping("{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        blocService.removeBloc(idBloc);

    }

}
