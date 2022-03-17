package com.clinicaapi.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public	class Consulta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "DATE")
	private LocalDate dataConsulta;
	
	@Column
	private String validado;
	
	@ManyToOne
	@JoinColumn(name = "id_pet")
	private Pet pet;
	
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Vet vet;
}
