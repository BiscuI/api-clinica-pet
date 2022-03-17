package com.clinicaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicaapi.models.Dono;

@Repository
public interface DonoRepository extends JpaRepository<Dono, Integer>{
	
	List<Dono> findByNome(String nome);
}
