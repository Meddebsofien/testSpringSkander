package com.example.skander.Controller;

import com.example.skander.Entities.Rayon;
import com.example.skander.Service.RayonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rayon")
@AllArgsConstructor
public class RayonController {
    RayonService rayonService;
@PostMapping("/addRay-Aff/{idBibloiotheque}")
    public Rayon ajouterRayEtAffecteraBIB(@RequestBody  Rayon rayon, @PathVariable("idBibloiotheque") Long idBibloiotheque){
    return  rayonService.ajouterRayEtAffecteraBIB(rayon,idBibloiotheque);

}
}
