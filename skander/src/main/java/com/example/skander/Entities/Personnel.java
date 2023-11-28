package com.example.skander.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
public class Personnel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPersonel;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    TypePersonel typePersonel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Rayon raypersonell;

     @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Rayon rayper;
}
