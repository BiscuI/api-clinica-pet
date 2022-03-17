package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicaapi.models.Dono;
import com.clinicaapi.repository.DonoRepository;

@Service
public class DonoService {
	@Autowired
	private DonoRepository donoRepository;
	
	
	public List<Dono> findAll(){
		return donoRepository.findAll();
	}
	
	public List<Dono> findByName(String nome) {
		return donoRepository.findByNome(nome);
	}
	
	public void addDono(Dono dono) {
		donoRepository.save(dono);
	}
}
