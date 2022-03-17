package com.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.clinicaapi.models.Consulta;
import com.clinicaapi.service.ConsultaService;

public class ConsultaController {
	@Autowired
	private ConsultaService consultaService;
	
	@GetMapping
	public ResponseEntity<List<Consulta>> findAll(){
		List<Consulta> list = consultaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Consulta> cadastrarConsulta(@RequestBody Consulta consulta) {
		consultaService.addConsulta(consulta);
		return ResponseEntity.ok().body(consulta);
	}
	
	@DeleteMapping
	public ResponseEntity<Consulta> deletarConsulta(@RequestBody Consulta consulta) {
		consultaService.deletarConsulta(consulta);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public void atualizarPet(@RequestBody Consulta consulta) {
		consultaService.addConsulta(consulta);
	}
}
