package br.com.jovemprogramador.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.jovemprogramador.model.Pessoa;

public class Desafio02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();

		System.out.println("Quantas pessoas deseja cadastrar? ");
		int quantidade = input.nextInt();

		for (int count = 0; count < quantidade; count++) {
			System.out.println("Pessoa #" + (count + 1));
			System.out.println("Digite o nome: ");
			String nome = input.next();
			System.out.println("Digite a idade: ");
			int idade = input.nextInt();
			System.out.println("Digite a altura: ");
			double altura = input.nextDouble();

			Pessoa pessoa = new Pessoa(nome, idade, altura);
			pessoas.add(pessoa);
		}
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoas);
		System.out.printf("Altura média: %.2f metros\n", pessoa.mediaAltura(pessoas));
		pessoa.menorDezesseis(pessoas);
		System.out.println(pessoas);

	}
}
