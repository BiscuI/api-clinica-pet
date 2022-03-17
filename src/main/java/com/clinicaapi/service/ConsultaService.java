package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinicaapi.models.Consulta;
import com.clinicaapi.repository.ConsultaRepository;

@RestController
@RequestMapping("/consultas")
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	public List<Consulta> findAll(){
		return consultaRepository.findAll();
	}
	
	public void addConsulta(Consulta consulta) {
		consultaRepository.save(consulta);
	}
	
	public void deletarConsulta(Consulta consulta) {
		consultaRepository.delete(consulta);
	}
}
