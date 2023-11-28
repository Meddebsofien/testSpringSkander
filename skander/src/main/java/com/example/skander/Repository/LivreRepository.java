package com.example.skander.Repository;

import com.example.skander.Entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre,Long> {
}
