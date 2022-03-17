package com.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.clinicaapi.models.Vet;
import com.clinicaapi.service.VetService;

public class VetController {
	@Autowired
	public VetService vetService;
	
	@GetMapping
	public ResponseEntity<List<Vet>> findAll(){
		List<Vet> list = vetService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Vet> cadastrarVet(@RequestBody Vet vet) {
		vetService.addVet(vet);
		return ResponseEntity.ok().body(vet);
	}
	
}
