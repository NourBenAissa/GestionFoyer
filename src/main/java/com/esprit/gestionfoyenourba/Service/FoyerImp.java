package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Foyer;
import com.esprit.gestionfoyenourba.Repository.FoyerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerImp implements FoyerService {
    private final FoyerRepo foyerRepo;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return(List<Foyer>) foyerRepo.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepo.deleteById(idFoyer);
    }
}
