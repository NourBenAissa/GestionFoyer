package com.esprit.gestionfoyenourba.Controller;

import com.esprit.gestionfoyenourba.Entity.Universite;
import com.esprit.gestionfoyenourba.Service.UniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
@RequiredArgsConstructor
public class UniversiteController {

    private final UniversiteService universiteService;

    @PostMapping
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("/all")
    public List<Universite> getAllUniversites() {
        return universiteService.retrieveAllUniversities();
    }

    @GetMapping("/{idUniversite}")
    public Universite getUniversiteById(@PathVariable Long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }



}
