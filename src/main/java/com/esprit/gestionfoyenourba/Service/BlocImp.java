package com.esprit.gestionfoyenourba.Service;

import com.esprit.gestionfoyenourba.Entity.Bloc;
import com.esprit.gestionfoyenourba.Repository.BlocRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocImp implements BlocService{

    private final BlocRepo blocRepo;


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
    public Bloc retrieveBloc(long idBloc) {
        return blocRepo.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepo.deleteById(idBloc);
    }
}
