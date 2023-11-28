package com.example.skander.Service;

import com.example.skander.Entities.Personnel;
import com.example.skander.Entities.Rayon;
import com.example.skander.Repository.PersonelRepository;
import com.example.skander.Repository.RayonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonnelServiceImpl implements  PersonnelService{
   RayonRepository rayonRepository;
   PersonelRepository personelRepository;
    @Override
    public Personnel ajouterPersonelEtAffecRayon(Personnel personnel, String codeRayon) {
       Personnel per =  personelRepository.save(personnel);
        Rayon ray  = rayonRepository.getRayonparCode(codeRayon);

        per.setRayper(ray);
        personelRepository.save(per);
        return per;



    }

    @Override
    public void desaffecterPerDuRay(long idPer) {
        Personnel p = personelRepository.findById(idPer).get();
        
    }
}
