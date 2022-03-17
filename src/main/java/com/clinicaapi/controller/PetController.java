package com.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.clinicaapi.models.Pet;
import com.clinicaapi.service.PetService;

public class PetController {
	@Autowired
	private PetService petService;
	
	@GetMapping
	public ResponseEntity<List<Pet>> findAll(){
		List<Pet> list = petService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Pet> cadastrarPet(@RequestBody Pet pet) {
		petService.addPet(pet);
		return ResponseEntity.ok(pet);
	}
	
	@PutMapping
	public void atualizarPet(@RequestBody Pet pet) {
		petService.addPet(pet);
	}
}
