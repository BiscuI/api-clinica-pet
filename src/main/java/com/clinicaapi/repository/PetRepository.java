package com.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicaapi.models.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}
