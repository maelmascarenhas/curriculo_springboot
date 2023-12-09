package com.curriculum.curriculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculum.curriculos.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}