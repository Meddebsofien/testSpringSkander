package com.example.skander.Service;

import com.example.skander.Entities.Livre;

import java.util.List;

public interface LivreService {

    void ajouterlivreeEtAffecterARayon(Livre livre,long idRayon);

    List<String> titrelivreParBibEtrAYON(long idBib , long idRay);
}
