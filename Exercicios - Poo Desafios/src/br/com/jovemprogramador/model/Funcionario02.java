package br.com.jovemprogramador.model;

public class Funcionario02 {

	private int id;
	private String nome;
	private double salario;
	
	public Funcionario02(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario02 [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	public void aumentoSalario(double porcentagem) {
		salario = salario + (salario*porcentagem);
	}
	
}
