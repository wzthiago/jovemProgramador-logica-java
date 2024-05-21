package br.com.jovemprogramador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Quantos funcionários deseja cadastrar? ");
		int qntFuncionarios = input.nextInt();

		List<Integer> id = new ArrayList<>();
		List<String> nome = new ArrayList<>();
		List<Double> salario = new ArrayList<>();

		/*
		 * adicionar(id, nome, salario, qntFuncionarios); exibirLista(id, nome,
		 * salario); aumentoFuncionarioPorcentagem(id, nome, salario); exibirLista(id,
		 * nome, salario);
		 */
		opcoesFuncionarios(id, nome, salario, qntFuncionarios);

	}

	public static void opcoesFuncionarios(List<Integer> id, List<String> nome, List<Double> salario, int qntFuncionarios) {

		int opcao = 1;
		do {
			String menu = "Menu de Operações";
			menu += "\n 0 - Sair";
			menu += "\n 1 - Adicionar Funcionários";
			menu += "\n 2 - Adicionar aumento em porcentagem";
			menu += "\n 3 - Listar Funcionários";
			System.out.println(menu);
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				adicionar(id, nome, salario, qntFuncionarios);
				break;
			case 2:
				aumentoFuncionarioPorcentagem(id, nome, salario);
				break;
			case 3:
				exibirLista(id, nome, salario);
				break;

			default:
				System.out.println("Digite uma opção válida!");
				break;
			}

		} while (opcao != 0);
	}

	public static void adicionar(List<Integer> id, List<String> nome, List<Double> salario, int qntFuncionarios) {

		for (int count = 0; count < qntFuncionarios; count++) {

			System.out.println("Digite o ID do " + (count + 1) + "ª, funcionário:");
			int idFuncionario = input.nextInt();
			while (idExiste(id, idFuncionario)) {
				System.out.println("Digite outro ID, #" + (count + 1) + " já existe");
				idFuncionario = input.nextInt();
				input.nextLine();
			}
			id.add(idFuncionario);

			System.out.println("Digite o nome do " + (count + 1) + "ª, funcionário:");
			String nomeFuncionario = input.next();
			nome.add(nomeFuncionario);

			System.out.println("Digite o saláro do " + (count + 1) + "ª, funcionário:");
			double salarioFuncionario = input.nextDouble();
			salario.add(salarioFuncionario);

		}
	}

	private static void exibirLista(List<Integer> id, List<String> nome, List<Double> salario) {

		System.out.println();
		System.out.println("Lista de Funcionários cadastrados:");
		for (int count = 0; count < id.size(); count++) {
			System.out
					.println("ID #" + id.get(count) + " Nome: " + nome.get(count) + " Salário: " + salario.get(count));
		}

	}

	private static void aumentoFuncionarioPorcentagem(List<Integer> id, List<String> nome, List<Double> salario) {

		System.out.println("Digite o ID do Funcionário que vai ter aumento");
		int idAumento = input.nextInt();

		int funcionarioId = id.indexOf(idAumento);
		if (funcionarioId != -1) {
			System.out.println("Digite a porcentagem de aumento: ");
			double porcentagem = input.nextDouble();
			double aumentosalario = salario.get(funcionarioId) * (1 + porcentagem / 100);
			salario.set(funcionarioId, aumentosalario);
		} else {
			System.out.println("Não existe nenhum funcionário com este ID");
		}
	}

	private static boolean idExiste(List<Integer> ids, int id) {
		return ids.contains(id);
	}

}
