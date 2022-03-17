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

import com.clinicaapi.models.Dono;
import com.clinicaapi.service.DonoService;

@RestController
@RequestMapping("/donos")
public class DonoController {
	@Autowired
	private DonoService donoService;
	
	public DonoController(DonoService service) {
		this.donoService = service;
	}
	
	@GetMapping
	private ResponseEntity<List<Dono>> findAll(){
		return ResponseEntity.ok().body(donoService.findAll());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrarCliente(@RequestBody Dono cliente) {
		donoService.addDono(cliente);
	}
	
}