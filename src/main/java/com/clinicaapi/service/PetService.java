package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaapi.models.Pet;
import com.clinicaapi.repository.PetRepository;

@RestController
@RequestMapping("/pets")
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
