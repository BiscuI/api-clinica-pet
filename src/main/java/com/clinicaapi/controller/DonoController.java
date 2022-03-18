package com.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaapi.models.Dono;
import com.clinicaapi.service.DonoService;

@RestController
@RequestMapping("/api")
public class DonoController {
	@Autowired
	private DonoService donoService;
	
	public DonoController(DonoService service) {
		this.donoService = service;
	}
	
	@GetMapping("/donos/buscar")
	public ResponseEntity<List<Dono>> buscarTodas(){
		return ResponseEntity.ok().body(donoService.findAll());
	}
	
	@GetMapping("/donos/buscar/{nome}")
	public ResponseEntity<List<Dono>> buscarPorNome(@PathVariable String nome){
		return ResponseEntity.ok().body(donoService.findByName(nome));
	}
	
	@PostMapping("/donos/cadastrar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Dono> cadastrarCliente(@RequestBody Dono cliente) {
		donoService.addDono(cliente);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
