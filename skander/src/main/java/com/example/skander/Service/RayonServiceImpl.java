package com.example.skander.Service;

import com.example.skander.Entities.Bibliotheque;
import com.example.skander.Entities.Rayon;
import com.example.skander.Repository.BibliothequeRepository;
import com.example.skander.Repository.RayonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RayonServiceImpl implements  RayonService{

    RayonRepository rayonRepository;
    BibliothequeRepository bibliothequeRepository;
    @Override
    public Rayon ajouterRayEtAffecteraBIB(Rayon rayon, Long idBibloiotheque) {

        Bibliotheque bibliotheque = bibliothequeRepository.findById(idBibloiotheque).get();
        rayon.setBibliotheque(bibliotheque);
        rayonRepository.save(rayon);
        return rayon;

    }
}
