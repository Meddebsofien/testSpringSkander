package com.example.skander.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
public class Livre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idLivre;
    String titre;
    String auteur;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Rayon rayonLivre;

}
