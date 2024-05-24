package br.com.jovemprogramador.model;

import java.util.ArrayList;
import java.util.List;

public class Aluguel {

	private String nome;
	private String email;
	private int quartos;
		
	public Aluguel() {
	}

	public Aluguel(String nome, String email, int quartos) {
		super();
		this.nome = nome;
		this.email = email;
		this.quartos = quartos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	
}