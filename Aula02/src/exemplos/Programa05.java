package exemplos;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		int dia = entrada.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		default:
			System.out.println("Opção inválida, digite de 1 a 6");
			break;
		}

		/*
		 * System.out.println("Digite o dia da semana: "); String dia2 = entrada.next();
		 * 
		 * switch (dia2) { case "1", "primeiro": System.out.println("Domingo"); break;
		 * case "2", "segundo":
		 * 
		 * System.out.println("Segunda"); break; case "3", "terceiro":
		 * System.out.println("Terça"); break; case "4", "quarto":
		 * System.out.println("Quarta"); break; case "5", "quinto":
		 * System.out.println("Quinta"); break; case "6", "sexto":
		 * System.out.println("Sexta"); break; default:
		 * System.out.println("Opção inválida, digite de 1 a 6, saindo do programa");
		 * break; }
		 */
	}
}
