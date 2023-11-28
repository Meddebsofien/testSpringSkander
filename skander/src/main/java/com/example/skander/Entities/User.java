package com.example.skander.Entities;

import jakarta.annotation.security.DenyAll;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;
    String prenom;
}
