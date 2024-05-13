package br.com.jovemprogramador.exercicios;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;

		do {
			System.out.println("\nExercícios Funções: ");
			System.out.println("Sair - 0");
			System.out.println("Exercício - 01");
			System.out.println("Exercício - 02");
			System.out.println("Exercício - 03");
			System.out.println("Exercício - 04");
			System.out.println("Exercício - 05");
			System.out.println("Exercício - 06");
			System.out.println("Exercício - 07");
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Obrigado, até a próxima!");
				break;
			case 1:
				double vetorNotas[] = { 10, 5, 6, 8, 7 };
				calcularNotas(vetorNotas);
				break;
			case 2:
				System.out.println("Digite a base do triângulo: ");
				double base = input.nextDouble();
				System.out.println("Digite a altura do triângulo: ");
				double altura = input.nextDouble();
				calcularAreaTriangulo(base, altura);
				break;
			case 3:
				gerarSenhaAleatoria();
				break;
			case 4:
				System.out.println("Digite a temperatura em Graus Celsius para converter em Fahrenheit: ");
				double temperaturaCelsius = input.nextDouble();
				double resultadoFahrenheit = converteGrausCelsiusFahrenheit(temperaturaCelsius);
				System.out.println("A temperatura " + temperaturaCelsius + "ª Celsius, convertida para "
						+ resultadoFahrenheit + "ª Fahrenheit.");
				break;
			case 5:
				System.out.println("Digite o primeiro nome: ");
				String nome01 = input.next();
				System.out.println("Digite o segundo nome: ");
				String nome02 = input.next();
				Boolean resultado = comparaString(nome01, nome02);
				System.out.println(resultado);
				break;
			case 6:
				System.out.println("Digite um número para saber o fatorial: ");
				long fatorial = input.nextLong();
				long resultadoFatorial = calcularFatorial(fatorial);
				System.out.println("O fatorial de " + fatorial + ", é: " + resultadoFatorial);
				break;
			case 7:

				break;

			default:
				System.out.println("Digite uma opção válida");
				break;
			}

		} while (opcao != 0);

	}

	public static void calcularNotas(double notas[]) {

		double somaNotas = 0;
		double maior = notas[0];
		double menor = notas[0];

		for (double nota : notas) {
			somaNotas += nota;

			if (nota < menor) {
				menor = nota;
			}
			if (nota > maior) {
				maior = nota;
			}
		}

		double media = somaNotas / notas.length;

		System.out.printf("Média das notas: %.2f", media);
		System.out.println("\nA maior nota: " + maior);
		System.out.println("A menor nota: " + menor);

	}

	public static void calcularAreaTriangulo(double base, double altura) {

		double areaTriangulo = (base * altura) / 2;
		System.out.println("Á área do triângulo é: " + areaTriangulo);

	}

	private static void gerarSenhaAleatoria() {
		

	}

	public static double converteGrausCelsiusFahrenheit(double temperatura) {

		double temperaturaFharenheit = (temperatura * 1.8) + 32;

		return temperaturaFharenheit;
	}

	public static Boolean comparaString(String nome01, String nome02) {
		if (nome01.equalsIgnoreCase(nome02)) {
			return true;
		} else {
			return false;
		}
	}

	private static long calcularFatorial(long fatorial) {
		long calcular = 1;
		if (fatorial >= 1) {
		}
		for (long i = 2; i <= fatorial; i++) {
			calcular *= i;
		}
		return calcular;
	}

}
