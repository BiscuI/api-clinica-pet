package com.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicaapi.models.Consulta;
import com.clinicaapi.repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	public List<Consulta> findAll(){
		return consultaRepository.findAll();
	}
	
	public void addConsulta(Consulta consulta) {
		consultaRepository.save(consulta);
	}
	
	public void deletarConsulta(Integer id) {
		consultaRepository.deleteById(id);;
	}
}
