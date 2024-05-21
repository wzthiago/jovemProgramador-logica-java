package model;

public class Pessoa {

	private String nome;
	private double altura;
	private int idade;
	private double peso;

	public Pessoa(String nome, double altura, int idade, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void calcularImc(double peso, double altura) {
		double calcularImc = peso / (altura * altura);
		System.out.println("Calculo IMC: " +calcularImc);
	}

	public boolean maiorDeIdade(int idade) {
		if (idade < 18) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", altura=" + altura + ", idade=" + idade + ", peso=" + peso + "]";
	}
	
	

}
