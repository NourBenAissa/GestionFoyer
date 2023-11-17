package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Chambre;
import com.esprit.gestionfoyenourba.Enum.TypeChambre;
import com.esprit.gestionfoyenourba.Repository.ChambreRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreImp implements ChambreService {

    private final ChambreRepo chambreRepo;


    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepo.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(Long idBloc, TypeChambre typeC) {
        return chambreRepo.getChambresParBlocEtType(idBloc, typeC);
    }


}
