package br.com.jovemprogramador.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = -1;

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("===== [01-05] -> Vetores ");
			System.out.println("===== [06-07] -> Matrizes ");
			System.out.println("Exercicio - 01");
			System.out.println("Exercicio - 02");
			System.out.println("Exercicio - 03");
			System.out.println("Exercicio - 04");
			System.out.println("Exercicio - 05");
			System.out.println("Exercicio - 06");
			System.out.println("Exercicio - 07");
			System.out.println("Para Sair - 0");
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Obrigado por usar o programa, até logo.");
				break;
			case 1:
				exercicioVetor01();
				break;
			case 2:
				exercicioVetor02();
				break;
			case 3:
				exercicioVetor03();
				break;
			case 4:
				exercicioVetor04();
				break;
			case 5:
				exercicioVetor05();
				break;
			case 6:
				exercicioMatriz01();
				break;
			case 7:
				exercicioMatriz02();
				break;

			default:
				System.out.println("Digite uma opção válida");
				break;
			}

		} while (opcao != 0);

	}

	private static void exercicioVetor01() {
		int vetorSoma[] = new int[10];
		int soma = 0;
		for (int count = 0; count < vetorSoma.length; count++) {
			System.out.println("Digite o " + (count + 1) + "ª valor:");
			vetorSoma[count] = input.nextInt();
			soma += vetorSoma[count];
		}
		System.out.println("A soma dos valores inseridos no vetor de " + vetorSoma.length + " posições é: " + soma);
		System.out.println("\n");
	}

	private static void exercicioVetor02() {
		// int vetor[] = {1,2,3,4,5,6,7,8,20,10};

		int vetor[] = new int[10];

		for (int count = 0; count < vetor.length; count++) {
			System.out.println("Digite o " + (count + 1) + "ª valor:");
			vetor[count] = input.nextInt();
		}

		boolean ordemCrescente = true;
		for (int count = 1; count < vetor.length; count++) {
			if (vetor[count] < vetor[count - 1]) {
				ordemCrescente = false;
				break;
			}
		}

		if (ordemCrescente == true) {
			System.out.println("O vetor está em ordem crescente");
		} else {
			System.out.println("O vetor não está em ordem crescente");
		}

		System.out.print("Ordem de inserção: ");
		for (int count = 0; count < vetor.length; count++) {
			System.out.print(vetor[count] + " ");
		}
		System.out.println("\n");

	}

	private static void exercicioVetor03() {

		System.out.println("Digite a quantidade de pessoas que deseja cadastrar: ");
		int quantidade = input.nextInt();

		String vetorNome[] = new String[quantidade];
		int vetorIdade[] = new int[quantidade];
		double vetorAltura[] = new double[quantidade];

		for (int count = 0; count < quantidade; count++) {
			System.out.println("Digite o nome da " + (count + 1) + "ª pessoa");
			vetorNome[count] = input.next();

			System.out.println("Digite a idade de " + vetorNome[count] + ": ");
			vetorIdade[count] = input.nextInt();
			input.nextLine();

			System.out.println("Digite a altura de " + vetorNome[count] + ": ");
			vetorAltura[count] = input.nextDouble();
			input.nextLine();
		}
		System.out.println("-------------------------------------------");
		for (int count = 0; count < quantidade; count++) {
			System.out.println("Dados da " + (count + 1) + "ª pessoa");
			System.out.println("Nome: " + vetorNome[count]);
			System.out.println("Idade: " + vetorIdade[count]);
			System.out.println("Altura: " + vetorAltura[count]);
			System.out.println("--------------------------------------------");
		}

		// Altura média
		double somaAltura = 0;
		for (double altura : vetorAltura) {
			somaAltura += altura;
		}
		double mediaAltura = somaAltura / quantidade;

		// System.out.println("Altura média: " + mediaAltura);
		System.out.printf("Altura média: %.2f metros\n", mediaAltura);

		// Porcentagem de pessoas com menos de 16 anos
		int menoresDezesseis = 0;
		for (int count = 0; count < vetorAltura.length; count++) {
			if (vetorIdade[count] < 16) {
				menoresDezesseis++;
			}
		}
		double porcentagem = (menoresDezesseis * 100) / vetorIdade.length;
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

		// Imprimindo as pessoas com menos de 16 anos
		for (int count = 0; count < vetorAltura.length; count++) {
			if (vetorIdade[count] < 16) {
				System.out.println(vetorNome[count]);
			}
		}

	}

	private static void exercicioVetor04() {

		System.out.println("Informe o tamanho do vetor: ");
		int tamanho = input.nextInt();
		int vetorInteiros[] = new int[tamanho];

		for (int count = 0; count < vetorInteiros.length; count++) {
			System.out.println("Digite o " + (count + 1) + "ª valor:");
			vetorInteiros[count] = input.nextInt();
		}

		int contadorPar = 0;
		for (int vetorInteiro : vetorInteiros) {
			if (vetorInteiro % 2 == 0) {
				System.out.println("Número par encontrado: " + vetorInteiro);
				contadorPar++;
			}
		}
		System.out.println("Quantidade de números pares: " + contadorPar);
		System.out.println("\n");
	}

	private static void exercicioVetor05() {

		System.out.println("Quantos quartos serão alugados? ");
		int quantidadeAlugueis = input.nextInt();

		String vetorNomes[] = new String[10];
		String vetorEmails[] = new String[10];

		for (int i = 0; i < vetorNomes.length; i++) {
			vetorNomes[i] = "";
			vetorEmails[i] = "";
		}

		for (int count = 0; count < quantidadeAlugueis; count++) {
			System.out.println("Digite o nome do " + (count + 1) + "ª estudante: ");
			String nome = input.next();
			System.out.println("Digite o e-mail do " + (count + 1) + "ª estudante: ");
			String email = input.next();
			System.out.println("Digite o número do quarto de [1 a 10]: ");
			int quarto = input.nextInt() - 1;

			if (vetorNomes[quarto].equals("")) {
				vetorNomes[quarto] = nome;
				vetorEmails[quarto] = email;
				System.out.println("Aluguel do quarto " + (quarto + 1) + " efetuado com Sucesso.\n");
			} else {
				System.out.println("Este quarto já está Ocupado, escolha outro quarto.");
				count--;
			}
		}

		int contador = 1;
		for (int count = 0; count < vetorNomes.length; count++) {
			if (!vetorNomes[count].equals("") && !vetorEmails[count].equals("")) {
				System.out.println("-----------------------------");
				System.out.println("Aluguel #" + contador);
				System.out.println("Quarto: " + (count + 1));
				System.out.println("Nome: " + vetorNomes[count]);
				System.out.println("E-mail: " + vetorEmails[count]);
				contador++;
			}
		}
	}

	private static void exercicioMatriz01() {

		int primeiraMatriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int segundaMatriz[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		int linhas = primeiraMatriz.length;
		int colunas = primeiraMatriz[0].length;
		int somaMatrizes[][] = new int[linhas][colunas];

		for (int countX = 0; countX < primeiraMatriz.length; countX++) {
			for (int countY = 0; countY < segundaMatriz.length; countY++) {

				somaMatrizes[countX][countY] = primeiraMatriz[countX][countY] + segundaMatriz[countX][countY];
			}
		}

		System.out.println("Soma das duas Matrizes: ");
		for (int countX = 0; countX < primeiraMatriz.length; countX++) {
			for (int countY = 0; countY < segundaMatriz.length; countY++) {
				System.out.print(somaMatrizes[countX][countY] + " ");
			}
		}
		System.out.println("\n");
	}

	private static void exercicioMatriz02() {

		int matriz[][] = new int[3][3];

		for (int countX = 0; countX < matriz.length; countX++) {
			for (int countY = 0; countY < matriz.length; countY++) {
				System.out.println("Digite o valor da " + (countX + 1) + "ª linha e " + (countY + 1) + "ª coluna: ");
				int valores = input.nextInt();
				matriz[countX][countY] = valores;
			}
		}

		for (int countX = 0; countX < matriz.length; countX++) {
			for (int countY = 0; countY < matriz.length; countY++) {
				System.out.print(matriz[countX][countY]+" ");
			}

		}

		int somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma da diagonal principal da matiz de 3x3 é: " + somaDiagonalPrincipal);

	}

}
