package br.com.jovemprogramador.model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	private static List<Funcionario> funcionarios = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(int id, String nome, double salario) {
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

	public static List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static void setFuncionarios(List<Funcionario> funcionarios) {
		Funcionario.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public static boolean adicionarFuncionario(int id, String nome, double salario) {
		if (idRepetido(id) == null) {
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
			return true;
		} else {
			return false;
		}
	}

	public static Funcionario idRepetido(int id) {
		for (Funcionario func : funcionarios) {
			if (func.getId() == id) {
				return func;
			}
		}
		return null;
	}

	public void listaFuncionario() {
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Id: "+ funcionario.getId()+"\nNome: "+funcionario.getNome()+"\nSalario: "+funcionario.getSalario()+"\n");
		}
	}
	
	public void aumentarSalario(double percentual) {
		this.salario += this.salario * percentual / 100;
		
	}

}
