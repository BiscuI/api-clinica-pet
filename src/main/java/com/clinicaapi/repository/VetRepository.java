package com.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicaapi.models.Vet;

@Repository
public interface VetRepository extends JpaRepository<Vet, Integer>{

}
