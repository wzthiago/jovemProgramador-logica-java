package br.com.jovemprogramador.model;

import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;

	public Pessoa() {

	}

	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double mediaAltura(List<Pessoa> pessoas) {
		double somaAltura = 0;
		for (Pessoa pessoa : pessoas) {
			somaAltura += pessoa.getAltura();
		}
		double mediaAltura = somaAltura / (pessoas.size());
		return mediaAltura;
	}

	public void menorDezesseis(List<Pessoa> pessoas) {
		int menorDezesseis = 0;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 16) {
				menorDezesseis++;
			}
		}

		double porcentagem = (menorDezesseis * 100) / pessoas.size();
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 16) {
				System.out.println("Nome: " + pessoa.getNome());
			}

		}

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
	


}
