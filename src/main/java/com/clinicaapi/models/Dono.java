package com.clinicaapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dono extends Pessoa{
	@Column(columnDefinition = "TEXT")
	private String endereco;
	
	@Column(columnDefinition = "TEXT")
	private String telefone;

	public Dono() {
		
	}
	
	public Dono(String nome, String email, String endereco, String telefone) {
		super(nome, email);
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
}
