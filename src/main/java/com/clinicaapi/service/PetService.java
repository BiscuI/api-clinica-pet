package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicaapi.models.Pet;
import com.clinicaapi.repository.PetRepository;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> findAll(){
		return petRepository.findAll();
	}
	
	public void addPet(Pet pet) {
		petRepository.save(pet);
	}
}
