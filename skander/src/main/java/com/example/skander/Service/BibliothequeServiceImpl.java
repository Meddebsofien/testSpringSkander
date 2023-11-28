package com.example.skander.Service;

import com.example.skander.Entities.Bibliotheque;
import com.example.skander.Repository.BibliothequeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BibliothequeServiceImpl implements  BibliothequeService{

    BibliothequeRepository bibliothequeRepository;
    @Override
    public Bibliotheque ajouterBibliotheque(Bibliotheque bibliotheque) {
        return bibliothequeRepository.save(bibliotheque);
    }
}
