package com.example.skander.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Rayon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRayon;
    String codeRayon;
    String nomRayon;

    @OneToMany(mappedBy = "raypersonell")
    @JsonIgnore
    List<Personnel> listPersonnel;

    @OneToOne(mappedBy = "rayper")
    @JsonIgnore
    Personnel personell;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Bibliotheque bibliotheque;

    @OneToMany(mappedBy = "rayonLivre")
   @JsonIgnore
    List<Livre> livre;

}
