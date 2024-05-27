package br.com.jovemprogramador.aplicacao;

import java.util.Scanner;

import br.com.jovemprogramador.model.Estudante;

public class Desafio03 {

	public static void main(String[] args) {

		Estudante quartos[] = new Estudante[10];
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos quartos deseja alugar? ");
		int quantidadeAlugueis = input.nextInt();
		input.nextLine();

		for (int i = 0; i < quantidadeAlugueis; i++) {

			System.out.println("Aluguel #" + (i + 1));
			System.out.print("Digite o nome do estudante: ");
			String nome = input.next();
			System.out.print("Digte o e-mail: ");
			String email = input.next();

			int quarto;

			while (true) {
				System.out.println("Quarto de 0 a 9");
				System.out.println("Qual quarto deseja alugar: ");
				quarto = input.nextInt();

				if (quarto < 0 || quarto > 9) {
					System.out.println("Número do quarto Inválido. Tente novamente");
				} else if (quartos[quarto] != null) {
					System.out.println("O Quarto " + quarto + " , já está ocupado, tente novamente");
				} else {
					break;

				}
			}
			quartos[quarto] = new Estudante(nome, email);

		}

		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println("Quarto " + i + " --> " + quartos[i]);
			}
		}
	}

}
