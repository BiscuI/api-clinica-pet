package com.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicaapi.models.Dono;

@Repository
public interface DonoRepository extends JpaRepository<Dono, Integer>{

}
