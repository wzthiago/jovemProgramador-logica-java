package br.com.jovemprogramador.exercicios;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int opcaoMenu = -1;
		do {

			System.out.println("0 - Para Sair");
			System.out.println("1 - Exercício 01");
			System.out.println("2 - Exercício 02");
			System.out.println("3 - Exercício 03");
			System.out.println("4 - Exercício 04");
			System.out.println("5 - Exercício 05");
			System.out.println("6 - Exercício 06");
			System.out.println("7 - Exercício 07");
			System.out.println("8 - Exercício 08");
			System.out.println("9 - Exercício 09");
			System.out.println("10 - Exercício 10");
			System.out.println("11 - Exercício 11");
			System.out.println("12 - Exercício 12");
			System.out.println("13 - Exercício 13");
			opcaoMenu = input.nextInt();

			switch (opcaoMenu) {
			case 0:
				System.out.println("Até a próxima");
				break;
			case 1:
				exercicio01();
				break;
			case 2:
				exercicio02();
				break;
			case 3:
				exercicio03();
				break;
			case 4:
				exercicio04();
				break;
			case 5:
				exercicio05();
				break;
			case 6:
				exercicio06();
				break;
			case 7:
				exercicio07();
				break;
			case 8:
				exercicio08();
				break;
			case 9:
				exercicio09();
				break;
			case 10:
				exercicio10();
				break;
			case 11:
				exercicio11();
				break;
			case 12:
				exercicio12();
				break;
			case 13:
				exercicio13();
				break;

			default:
				System.out.println("Digite uma opção válida");
				break;
			}

		} while (opcaoMenu != 0);

	}

	private static void exercicio01() {
		int senha = 0;
		System.out.println("Informe a senha numerica: ");
		senha = input.nextInt();

		while (senha != 2022) {
			System.out.println("Senha Inválida, informe a senha: ");
			senha = input.nextInt();

		}

		System.out.println("Acesso Premitido");
	}

	private static void exercicio02() {
		// TODO Auto-generated method stub

	}

	private static void exercicio03() {

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int opcao = 0;

		do {
			System.out.println("Informa o tipo de Combustível: ");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Fim");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel + "\n");
				break;

			default:
				System.out.println("Informa uma opção válida");
				break;
			}

		} while (opcao != 4);
	}

	private static void exercicio04() {
		System.out.println("Digite um número entre 1 a 1000: ");
		int numero = input.nextInt();

		if (numero < 1 || numero > 1000) {
			System.out.println("Digite um valor válido");
			return;
		}

		for (int count = 1; count <= numero; count++) {
			if (count % 2 != 0) {
				System.out.println(count);
			}
		}

	}

	private static void exercicio05() {
		// TODO Auto-generated method stub

	}

	private static void exercicio06() {
		// TODO Auto-generated method stub

	}

	private static void exercicio07() {

		int numero = 0;

		System.out.println("Digite um número para saber seu fatorial");
		numero = input.nextInt();

		int fatorial = numero;

		for (int count = numero; count > 1; count--) {
			fatorial = fatorial * (count - 1);
			System.out.print(count + " x ");
		}
		System.out.println("1 = " + fatorial);
		System.out.println("Número " + numero + ", seu fatorial é " + fatorial);

	}

	private static void exercicio08() {
		System.out.println("Digite quantos números você deseja saber se está no intervalo de [10-20]");
		int numeroTentativas = input.nextInt();
		int numero1 = 0;
		int numero2 = 0;

		for (int count = 0; count < numeroTentativas; count++) {
			System.out.println("Digite o valor:");
			int valorCapturado = input.nextInt();

			if (valorCapturado >= 10 && valorCapturado <= 20) {
				numero1++;
			} else {
				numero2++;
			}
		}
		System.out.println(numero1 + " on");
		System.out.println(numero2 + " off");

	}

	private static void exercicio09() {

		int soma = 0;
		for (int count = 1; count <= 100; count++) {
			soma = soma + count;
			System.out.println("Somando números [1-100] ==> " + soma);
		}
		System.out.println("A Soma dos números de [1-100] ==> " + soma);

	}

	private static void exercicio10() {

		int soma = 0;

		System.out.println("Digite um número positivo para somar, ou um número negativo para sair: ");
		int numero = input.nextInt();

		while (numero >= 0) {
			soma += numero;
			System.out.println("Digite outro número positivo para somar, ou um número negativo para sair: ");
			numero = input.nextInt();
		}
		System.out.println("A soma dos números inseridos é ==> " + soma);

	}

	private static void exercicio11() {
		int numerosPares = 0;
		for (int count = 0; count <= 20; count++) {
			if (count % 2 == 0) {
				numerosPares = count;
				System.out.println("Números Pares entre [2-20] ==> " + numerosPares);
			}
		}

	}

	private static void exercicio12() {

		String palavra;

		System.out.println("Digite uma palavra: ");
		palavra = input.next();
		for (int count = 0; count < palavra.length(); count++) {
			char verificar = palavra.charAt(count);
			if (verificar == 'a' || verificar == 'A') {

				System.out.println("Letra [a] encontrada na posição " + (count + 1));
			}
		}

	}

	private static void exercicio13() {
		// TODO Auto-generated method stub

	}

}
