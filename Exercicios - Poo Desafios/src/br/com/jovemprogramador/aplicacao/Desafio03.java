package br.com.jovemprogramador.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.jovemprogramador.model.Aluguel;

public class Desafio03 {

	public static void main(String[] args) {

		List<Aluguel> alugueis = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos quartos deseja alugar? ");
		int quantidadeAlugueis = input.nextInt();

		for (int i = 0; i < quantidadeAlugueis; i++) {

			System.out.println("Digite o nome do estudante: ");
			String nome = input.next();
			System.out.println("Digte o e-mail: ");
			String email = input.next();

			System.out.println("Qual quarto deseja alugar: ");
			int quarto = input.nextInt();

			Aluguel aluguel = new Aluguel(nome, email, quarto);
			alugueis.add(aluguel);
		}

		for (Aluguel aluguel : alugueis) {
			System.out.println("Quarto: " + aluguel.getQuartos());
		}
	}

}
