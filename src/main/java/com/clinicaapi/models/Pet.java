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
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "DATE")
	private LocalDate aniversario;
	
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Dono dono;
	
	@Column(columnDefinition = "TEXT", unique=true)
	private String nome;
}
