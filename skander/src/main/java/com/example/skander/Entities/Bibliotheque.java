package com.example.skander.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Bibliotheque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBibliotheque;
    String nomBibliotheque;
    Date date;


    @OneToMany(mappedBy = "bibliotheque")
    @JsonIgnore
    List<Rayon> listRayonsbib;
}
