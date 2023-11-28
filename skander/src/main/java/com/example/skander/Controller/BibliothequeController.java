package com.example.skander.Controller;

import com.example.skander.Entities.Bibliotheque;
import com.example.skander.Service.BibliothequeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/bibliotheque")
public class BibliothequeController {
    BibliothequeService bibliothequeService;

    @PostMapping("/add")
    public Bibliotheque ajouterBibliotheque( @RequestBody  Bibliotheque bibliotheque){
        return  bibliothequeService.ajouterBibliotheque(bibliotheque);

    }
}
