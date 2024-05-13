package br.com.jovemprogramador.exercicios;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0;

		do {

			System.out.println(escreverMenu());
			menu = input.nextInt();

			switch (menu) {
			case 0:
				System.out.println("Obrigado por usar o programa.");
				break;
			case 1:
				numeroNegativoPositivo();
				break;
			case 2:
				numeroParImpar();
				break;
			case 3:
				numeroQualIntervalo();
				break;
			case 4:
				diaUtilFinaldeSemana();
				break;
			case 5:
				maiorNumero();
				break;
			case 6:
				mediaAluno();
				break;
			case 7:
				letraVogalConsoante();
				break;
			case 8:
				calcularNumeroCedulas();
				break;
			case 9:
				jogoDados();
				break;
			case 10:
				calculadoraImc();
				break;
			case 11:
				mesNumeroDeDias();
				break;
			case 12:
				numeroMaiorOperadorTernario();
				break;
			case 13:
				converterNotas();
				break;
			case 14:
				menuOpcaoMensagem();
				break;

			default:
				System.out.println("Digite uma opção válida.");
				break;
			}
		} while (menu != 0);
	}

	public static String escreverMenu() {
		System.out.println("\n");
		String menu = "\t=========================================== Menu de opções - Escolha uma opção de 0 a 14 =================================================\n\n";
		menu += "\t1 - Para ler um número inteiro e informar se o número é negativo ou positivo\n";
		menu += "\t2 - Para ler um número inteiro e informar se o número é par ou impar\n";
		menu += "\t3 - Para ler um número e informar em qual intervalo ele está ==> ([0-25], [25-50], [50-75], [75-100])\n";
		menu += "\t4 - Para solicitar ao usuario o nome de um dia da semana e informe se é um dia útil ou final de semana\n";
		menu += "\t5 - Para pedir ao usuário três números e imprima o maior deles\n";
		menu += "\t6 - Para receber 3 notas de um aluno e calcular a média, se maior ou igual a 7 imprima Aprovado se não Reprovado\n";
		menu += "\t7 - Para pedir ao usuario uma letra do alfabeto e determinar se e uma vogal ou uma consoante\n";
		menu += "\t8 - Para caixa eletronico. O usuario informa o valor que deseja sacar,o programa calcula o número de cédulas de cada valor (100, 50, 20, 5, 2, 1)\n";
		menu += "\t9 - Para Jogo de Dados. É lançado dois dados, o programa determina se o usuario ganhou ou perdeu baseado na soma dos dados (ganhou = 7, 11 - perdeu = 2, 3, 12\n";
		menu += "\t10 - Para calcular o Índice de Massa Corporal(IMC), e informar a categoria de acordo com a tabela IMC\n";
		menu += "\t11 - Para pedir ao usuario inserir um numero de 1 a 12 representando um mês do ano. Imprimir o numero de dias e o nome do mês\n";
		menu += "\t12 - Para receber dois números inteiros como entrada e exibir o maior deles, usando o operador ternario\n";
		menu += "\t13 - Para receber uma nota de 0 a 10 e converta para um conceito de A a F ==> (A:9-10 B:8 C:7 D:6 E:5 F:restante(default)\n";
		menu += "\t14 - Para exibir um menu com opções numericas de 1 a 3, o usuário deve escolher uma opção e exibir uma mensagem correspondente\n";
		menu += "\t==========================================================================================================================================\n";
		return menu;
	}

	public static void numeroNegativoPositivo() {

		System.out.println("Digite um número inteiro para saber se o número é Positivo ou Negativo: ");
		int numero = input.nextInt();

		if (numero > 0) {
			System.out.println("Você digitou [" + numero + "] este número é positivo");
		} else if (numero < 0) {
			System.out.println("Você digitou [" + numero + "] este número é negativo");
		} else {
			System.out.println("Você digitou [" + numero + "] este número é neutro");
		}

		System.out.println("-------------------------------------------------------\n");
	}

	public static void numeroParImpar() {

		System.out.println("Digite um número inteiro para saber se o número é par ou impar: ");
		int numero = input.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Você digitou [" + numero + "] este número é par");
		} else {
			System.out.println("Você digitou [" + numero + "] este número é impar");
		}
		System.out.println("-------------------------------------------------------\n");
	}

	public static void numeroQualIntervalo() {

		System.out.println("Digite um valor de 0 a 100 para saber em qual intervalo ele está: ");
		int numero = input.nextInt();

		if (numero >= 0 && numero <= 25) {
			System.out.println("Voce digitou [" + numero + "], este número está entre o intervalo de [0-25]");
		} else if (numero > 25 && numero <= 50) {
			System.out.println("Voce digitou [" + numero + "], este número está entre o intervalo de [26-50]");
		} else if (numero > 50 && numero <= 75) {
			System.out.println("Voce digitou [" + numero + "], este número está entre o intervalo de [51-75]");
		} else if (numero > 75 && numero <= 100) {
			System.out.println("Voce digitou [" + numero + "], este número está entre o intervalo de [76-100]");
		} else {
			System.out.println("Este número [" + numero + "] está fora do intervalo [0-100], fechando programa...");
		}

		System.out.println("---------------------------------------------------------------------------------------\n");
	}

	public static void diaUtilFinaldeSemana() {

		System.out.println("Dia Útil <--> Final de Semana");
		System.out.println("Digite o dia da semana que deseja saber: ");
		String dia = input.next().toLowerCase();

		switch (dia) {
		case "segunda-feira":
			System.out.println("Você digitou [" + dia + "], é dia útil");
			break;
		case "terça-feira":
			System.out.println("Você digitou [" + dia + "], é dia útil");
			break;
		case "quarta-feira":
			System.out.println("Você digitou [" + dia + "], é dia útil");
			break;
		case "quinta-feira":
			System.out.println("Você digitou [" + dia + "], é dia útil");
			;
			break;
		case "sexta-feira":
			System.out.println("Você digitou [" + dia + "], é dia útil");
			break;
		case "sábado":
			System.out.println("Você digitou [" + dia + "], é dia útil");
			break;
		case "domingo":
			System.out.println("Você digitou [" + dia + "], é final de semana");
			break;

		default:
			System.out.println("Digite uma opção válida, fechando programa...");
			break;
		}

		System.out.println("-------------------------------------------------\n");
	}

	public static void maiorNumero() {

		System.out.println("Digite três números para saber o maior");
		System.out.println("Digite o primeiro número: ");
		int num1 = input.nextInt();
		System.out.println("Digite o segudo número: ");
		int num2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = input.nextInt();

		int auxiliar;

		if (num1 >= num2 && num1 >= num3) {
			auxiliar = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			auxiliar = num2;
		} else {
			auxiliar = num3;
		}

		System.out.println("O número " + auxiliar + " é o maior número, entre os números que você digitou [" + num1
				+ ", " + num2 + ", " + num3 + "]");

		/*
		 * auxiliar = Math.max(Math.max(num1, num2), num3);
		 * System.out.println("O maior número usando o método Math.max é ==>"
		 * +auxiliar);
		 */

		System.out.println("---------------------------------------------------------------------------------------\n");
	}

	public static void mediaAluno() {

		System.out.println("Informe suas três notas para saber se você foi Aprovado ou Reprovado: ");
		System.out.println("Digite a primeira nota: ");
		double nota1 = input.nextInt();
		System.out.println("Digite a seguda nota: ");
		double nota2 = input.nextInt();
		System.out.println("Digite a terceira nota: ");
		double nota3 = input.nextInt();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Sua média foi [" + media + "], você foi APROVADO o/");
		} else {
			System.out.println("Sua média foi [" + media + "], você foi REPROVADO ==> Estude +");
		}
		System.out.println("----------------------------------------------------------------------------\n");

	}

	public static void letraVogalConsoante() {

		System.out.println("Digite uma letra para saber se é vogal ou consoante: ");
		char letra = input.next().toLowerCase().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra digitada foi [" + letra + "], é uma vogal.");
		} else {
			System.out.println("A letra digitada foi [" + letra + "], é uma consoante.");
		}
		System.out.println("-------------------------------------------------------");

		// Desta forma o programa vai aceitar apenas letras que estão no alfabeto de
		// [a-z]
		System.out.println("Digite uma letra para saber se é vogal ou consoante, usando método contains: ");
		String letra1 = input.next().toLowerCase();

		if (letra1.length() == 1 && letra1.matches("[a-z]")) {
			if ("aeiou".contains(letra1)) {
				System.out.println("É uma vogal");
			} else {
				System.out.println("É uma consoante");
			}
		} else {
			System.out.println(
					"Você deve digitar apenas letras válidas, que existem no alfabeto, o programa será encerrado.");
		}
		System.out.println("-------------------------------------------------------");
	}

	public static void calcularNumeroCedulas() {

		int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
		int resto100, resto50, resto20, resto10, resto5, resto2, resto1;

		System.out.println("Digite o valor que deseja sacar: ");
		int valor = input.nextInt();
		// valor ex: 373

		if (valor > 0) {

			notas100 = valor / 100; // 3
			resto100 = valor % 100; // 73

			notas50 = resto100 / 50; // 1
			resto50 = resto100 % 50; // 23

			notas20 = resto50 / 20; // 2
			resto20 = resto50 % 20; // 3

			notas10 = resto20 / 10; // 0
			resto10 = resto20 % 10; // 0

			notas5 = resto10 / 5; // 0
			resto5 = resto10 % 5; // 3

			notas2 = resto5 / 2; // 1
			resto2 = resto5 % 2; // 2

			notas1 = resto2 / 1; // 2
			resto1 = resto2 % 1; // 0

			System.out.println("-------------------------------\n");
			System.out.println("Valor do saque R$" + valor + "\n");

			System.out.println("O número de cédulas de R$ 100 ==> " + notas100);
			System.out.println("O número de cédulas de R$ 50 ==> " + notas50);
			System.out.println("O número de cédulas de R$ 20 ==> " + notas20);
			System.out.println("O número de cédulas de R$ 10 ==> " + notas10);
			System.out.println("O número de cédulas de R$ 5 ==> " + notas5);
			System.out.println("O número de cédulas de R$ 2 ==> " + notas2);
			System.out.println("O número de cédulas de R$ 1 ==> " + notas1 + "\n");

		} else {
			System.out.println("Não é possível realizar saque de um valor negativo");
		}
	}

	public static void jogoDados() {

		Scanner entrada = new Scanner(System.in);
		char opcao = 's';

		System.out.println("================== Jogo de Dados ==================");
		System.out.println("Se a soma dos dois dados for 7 ou 11 você GANHA");
		System.out.println("Se a soma dos dois dados for 2, 3 ou 12 você PERDE\n");
		System.out.println("Pressione ENTER para começar o jogo e lançar dois dados");
		String comecar = entrada.nextLine();
		System.out.println("começamos o jogo...\n");

		while (opcao == 's') {
			int dado1 = (int) (Math.random() * 6 + 1);
			int dado2 = (int) (Math.random() * 6 + 1);
			int soma = dado1 + dado2;

			System.out.println("Dado 01 ==> " + dado1);
			System.out.println("Dado 02 ==> " + dado2);
			System.out.println("Soma dos dados foi [" + soma + "]\n");

			if (soma == 7 || soma == 11) {
				System.out.println("Você Ganhou\n");
			} else if (soma == 2 || soma == 3 || soma == 12) {
				System.out.println("Você Perdeu\n");
			} else {
				System.out.println("Tente novamente");
			}

			System.out.println("Deseja continuar jogando? (s/n)\n");
			opcao = input.next().charAt(0);
		}
		//entrada.close();
	}

	public static void calculadoraImc() {

		System.out.println("======== Calculadora IMC - Índice de Massa Corporal ========\n");
		System.out.println("Digite o seu peso: ");
		double peso = input.nextDouble();
		System.out.println("Digite a sua altura: ");
		double altura = input.nextDouble();
		double imc = peso / (altura * altura);

		System.out.printf("Seu IMC é: %.2f%n", imc);

		if (imc < 18.5) {
			System.out.println("Classificação IMC ==> Abaixo do peso\n");
		} else if (imc >= 18.5 && imc <= 24.99) {
			System.out.println("Classificação IMC ==> Peso Normal\n");
		} else if (imc >= 25 && imc <= 29.99) {
			System.out.println("Classificação IMC ==> Sobrepeso\n");
		} else {
			System.out.println("Classificação IMC ==> Obesidade\n");
		}
	}

	public static void mesNumeroDeDias() {

		System.out.println("Digite um número de 1 a 12 para saber o mês e quantos dias ele tem: ");
		int mes = input.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Janeiro tem 31 dias");
			break;
		case 2:
			System.out.println("Fevereiro tem 28 ou 29 dias");
			break;
		case 3:
			System.out.println("Março tem 31 dias");
			break;
		case 4:
			System.out.println("Abril tem 30 dias");
			break;
		case 5:
			System.out.println("Maio tem 31 dias");
			break;
		case 6:
			System.out.println("Junho tem 30 dias");
			break;
		case 7:
			System.out.println("Julho tem 31 dias");
			break;
		case 8:
			System.out.println("Agosto tem 31 dias");
			break;
		case 9:
			System.out.println("Setembro tem 30 dias");
			break;
		case 10:
			System.out.println("Outubro tem 31 dias");
			break;
		case 11:
			System.out.println("Novembro tem 30 dias");
			break;
		case 12:
			System.out.println("Dezembro tem 31 dias");
			break;
		default:
			System.out.println("Digite uma opção válida, fechando programa...");
			break;
		}
		System.out.println("------------------------------------------------------------------\n");
	}

	public static void numeroMaiorOperadorTernario() {

		System.out.println("Entre dois números informar qual é o maior usando operador ternário");
		System.out.println("Digite o primeiro número: ");
		int numero2 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero1 = input.nextInt();

		String maior = (numero1 > numero2 ? "O número " + numero1 + " é o Maior"
				: "O número " + numero2 + " é o Maior");
		System.out.println(maior);

		System.out.println("-----------------------------------------------------------------------------------\n");
	}

	public static void converterNotas() {

		System.out.println("Digite uma nota de 0 a 10 para converter a nota para o conceito de [A a F]");
		int nota = input.nextInt();

		switch (nota) {
		case 9, 10:
			System.out.println("Nota " + nota + " convertida para ==> Nota A\n");
			break;
		case 8:
			System.out.println("Nota " + nota + " convertida para ==> Nota B\n");
			break;
		case 7:
			System.out.println("Nota " + nota + " convertida para ==> Nota C\n");
			break;
		case 6:
			System.out.println("Nota " + nota + " convertida para ==> Nota D\n");
			break;
		case 5:
			System.out.println("Nota " + nota + " convertida para ==> Nota E\n");
			break;
		default:
			System.out.println("Nota " + nota + " convertida para ==> Nota F\n");
			break;
		}
	}

	public static void menuOpcaoMensagem() {

		String menu = "========== Menu de Opções ==========\n";
		menu += "\t0 - Sair do Programa\n";
		menu += "\t1 - Para mensagem motivacional\n";
		menu += "\t2 - Para mensagem aleatória";

		System.out.println(menu);
		int opcao2 = input.nextInt();

		switch (opcao2) {
		case 0:
			System.out.println("Saindo do programa...");
			break;
		case 1:
			System.out.println("O sucesso é a soma de pequenos esforços repetidos dia após dia.");
			break;
		case 2:
			System.out.println("Todo dia é uma nova oportunidade de ser feliz.");
			break;
		default:
			System.out.println("Digite uma opção válida, fechando programa...");
			break;
		}
	}
}

