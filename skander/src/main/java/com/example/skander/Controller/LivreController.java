package com.example.skander.Controller;

import com.example.skander.Entities.Livre;
import com.example.skander.Service.LivreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/livre")
public class LivreController {

    LivreService livreService;

    @PostMapping("/add/{idRayon}")
    void ajouterlivreeEtAffecterARayon(@RequestBody  Livre livre, @PathVariable("idRayon") long idRayon){

        livreService.ajouterlivreeEtAffecterARayon(livre,idRayon);

    }


    @GetMapping("/gettitre/{idBib}/{idRay}")
    List<String> titrelivreParBibEtrAYON( @PathVariable("idBib") long idBib , @PathVariable("idRay") long idRay)
    {
      return   livreService.titrelivreParBibEtrAYON(idBib,idRay);
    }
}
