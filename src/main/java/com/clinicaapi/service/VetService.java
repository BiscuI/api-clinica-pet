package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicaapi.models.Vet;
import com.clinicaapi.repository.VetRepository;

@Service
public class VetService {
	@Autowired
	private VetRepository vetRepository;
	
	public List<Vet> findAll(){
		return vetRepository.findAll();
	}
	
	public void addVet(Vet vet) {
		vetRepository.save(vet);
	}
	
}
