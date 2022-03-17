package com.clinicaapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vet extends Pessoa{
	@Column(columnDefinition = "TEXT")
	private String identificador;
	
	public Vet() {	
	}
	
	public Vet(String nome, String email, String identificador) {
		super(nome, email);
		this.identificador = identificador;
	}
}
