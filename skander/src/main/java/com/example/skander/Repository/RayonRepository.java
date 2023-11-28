package com.example.skander.Repository;

import com.example.skander.Entities.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RayonRepository extends JpaRepository<Rayon,Long> {

    @Query("select r from Rayon  r where  r.codeRayon=:ray")
    Rayon getRayonparCode(@Param("ray") String ray);
}
