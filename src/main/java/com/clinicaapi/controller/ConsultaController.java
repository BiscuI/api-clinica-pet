package com.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaapi.models.Consulta;
import com.clinicaapi.service.ConsultaService;

@RestController
@RequestMapping("/consultas")
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
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Consulta> deletarConsulta(@PathVariable Integer id) {
		consultaService.deletarConsulta(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Consulta> atualizarConsulta(@RequestBody Consulta consulta) {
		consultaService.addConsulta(consulta);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
