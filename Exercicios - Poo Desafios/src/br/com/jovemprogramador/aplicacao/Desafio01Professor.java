package br.com.jovemprogramador.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.jovemprogramador.model.Aluguel;
import br.com.jovemprogramador.model.Funcionario02;

public class Desafio01Professor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Funcionario02> lista = new ArrayList<>();

		System.out.println("Digite a quantidade de funcionários para cadastrar: ");
		int quantidadeFuncionario = input.nextInt();

		for (int count = 0; count < quantidadeFuncionario; count++) {

			System.out.println("Funcionário #" + (count + 1));
			System.out.println("Id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.println("Nome: ");
			String nome = input.next();
			System.out.println("Salário: ");
			double salario = input.nextDouble();

			Funcionario02 funcionaio = new Funcionario02(id, nome, salario);
			lista.add(funcionaio);

		}

		System.out.println("Informe o ID do funcionário que terá aumento salarial: ");
		int idAumento = input.nextInt();
		for (Funcionario02 func : lista) {
			if (func.getId() == idAumento) {
				System.out.println("Informe o percentual de aumento: ");
				double aumento = input.nextDouble();
			
				/*
				 * double salarioAtual = func.getSalario(); 
				 * double novoSalario = salarioAtual +
				 * (salarioAtual * aumento); 
				 * func.setSalario(novoSalario);
				 */
				
				func.aumentoSalario(aumento);

				
			}
			
		}
		
		for (Funcionario02 funcionario02 : lista) {
			System.out.println(funcionario02);
		}

	}
}
