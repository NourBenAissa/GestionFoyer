package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Bloc;
import com.esprit.gestionfoyenourba.Entity.Chambre;
import com.esprit.gestionfoyenourba.Entity.Foyer;
import com.esprit.gestionfoyenourba.Repository.BlocRepo;
import com.esprit.gestionfoyenourba.Repository.ChambreRepo;
import com.esprit.gestionfoyenourba.Repository.FoyerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocImp implements BlocService{

    private final BlocRepo blocRepo;
    private final ChambreRepo chambreRepo;
    private final FoyerRepo foyerRepo;

    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blocRepo.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc getBlocById(long idBloc) {
        return blocRepo.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepo.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> idChambre, Long idBloc) {
        Bloc bloc = blocRepo.findById(idBloc).orElse(null);

        for(Long id:idChambre){
            Chambre chambre = chambreRepo.findById(id).orElse(null);
            chambre.setBloc(bloc);
            chambreRepo.save(chambre);
        }

        return blocRepo.save(bloc);
}

    @Override
    public Bloc affecyerBlocAFoye(Long idBloc, Long idFoyer) {
        Bloc bloc = blocRepo.findById(idBloc).orElse(null);

        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);

        bloc.setFoyer(foyer);
        blocRepo.save(bloc);

        return bloc;
    }
}
