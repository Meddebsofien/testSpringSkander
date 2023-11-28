package com.example.skander.Service;

import com.example.skander.Entities.Bibliotheque;
import com.example.skander.Entities.Livre;
import com.example.skander.Entities.Rayon;
import com.example.skander.Repository.BibliothequeRepository;
import com.example.skander.Repository.LivreRepository;
import com.example.skander.Repository.RayonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LivreServiceImpl implements LivreService{

    LivreRepository livreRepository;
    RayonRepository rayonRepository;
    BibliothequeRepository bibliothequeRepository;
    @Override
    public void ajouterlivreeEtAffecterARayon(Livre livre, long idRayon) {
        Rayon rayon =  rayonRepository.findById(idRayon).get();
        livre.setRayonLivre(rayon);
        livreRepository.save(livre);
    }

    @Override
    public List<String> titrelivreParBibEtrAYON(long idBib, long idRay) {
        Bibliotheque b = bibliothequeRepository.findById(idBib).get();
        Rayon r = rayonRepository.findById(idRay).get();
        List<String> lisTitre =null;
        List<Livre> listLivre=livreRepository.findAll();
        listLivre.stream().forEach(livre -> {
            if(livre.getRayonLivre() == r && livre.getRayonLivre().getBibliotheque()==b){
                lisTitre.add(livre.getTitre());
            }
        });

        return lisTitre;
    }
}
