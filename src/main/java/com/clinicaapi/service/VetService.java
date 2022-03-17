package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaapi.models.Vet;
import com.clinicaapi.repository.VetRepository;

@RestController
@RequestMapping("/vets")
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
