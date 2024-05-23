package br.com.jovemprogramador.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.jovemprogramador.model.Funcionario;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("Digite a quantidade de funcionários para cadastrar: ");
		int quantidadeFuncionario = input.nextInt();

		for (int count = 0; count < quantidadeFuncionario; count++) {

			System.out.println("Funcionário #" + (count + 1));
			System.out.println("Id: ");
			int id = input.nextInt();

			System.out.println("Nome: ");
			String nome = input.next();

			System.out.println("Salário: ");
			double salario = input.nextDouble();

			if (!Funcionario.adicionarFuncionario(id, nome, salario)) {
				System.out.println("ID:" + id + " já existe, digite outro ID para este Funcionário");
				System.out.println("\n");
				count--;
			}

		}

		System.out.println("Informe o ID do funcionário que terá aumento salarial: ");
		int idAumento = input.nextInt();

		// Funcionario funcionarioAumento = Funcionario.idRepetido(idAumento);
		Funcionario funcAumento = new Funcionario();
		Funcionario funcAux = new Funcionario();
		funcAumento = funcAux.idRepetido(idAumento);

		if (funcAumento == null) {
			System.out.println("Funcionário não encontrado");

		} else {

			System.out.println("Informe o percentual de aumento: ");
			double aumento = input.nextDouble();
			funcAumento.aumentarSalario(aumento);
		}

		Funcionario funcionario = new Funcionario();
		funcionario.listaFuncionario();

		// Funcionario funcionario = new Funcionario(id, nome, salario);
		// funcionarios.add(funcionario);
	}

}
