package com.clinicaapi.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String nome;
	
	@Column(columnDefinition = "TEXT", unique=true)
	private String email;

	public Pessoa(){}
	
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
}
