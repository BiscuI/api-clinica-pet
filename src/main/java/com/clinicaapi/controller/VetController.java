package com.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaapi.models.Vet;
import com.clinicaapi.service.VetService;

@RestController
@RequestMapping("/api")
public class VetController {
	@Autowired
	public VetService vetService;
	
	@GetMapping("/vets/buscar")
	public ResponseEntity<List<Vet>> BuscarTodos(){
		List<Vet> list = vetService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("/vets/cadastrar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Vet> cadastrarVet(@RequestBody Vet vet) {
		vetService.addVet(vet);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
