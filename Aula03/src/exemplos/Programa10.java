package exemplos;

import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.ranges.DocumentRange;

public class Programa10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String senhaGerada = "";
		String simbolos = "";

		String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
		String letrasMinusculas = "abcdefghijklmnopqrstuvxwyz";
		String numeros = "0123456789";
		String caracter = "@#%&";

		System.out.println("Qual o comprimento da senha?");
		int comprimento = input.nextInt();
		input.nextLine();

		System.out.println("Você deseja na senha letras maiusculas ? [s/n]");
		char opcao1 = input.nextLine().charAt(0);

		System.out.println("Você deseja na senha letras minusculas ? [s/n]");
		char opcao2 = input.nextLine().charAt(0);

		System.out.println("Você deseja na senha números ? [s/n]");
		char opcao3 = input.nextLine().charAt(0);

		System.out.println("Você deseja na senha símbolos ? [s/n]");
		char opcao4 = input.nextLine().charAt(0);

		if (opcao1 == 's') {
			simbolos += letrasMaiusculas;
		}
		if (opcao2 == 's') {
			simbolos += letrasMinusculas;
		}
		if (opcao3 == 's') {
			simbolos += numeros;
		}
		if (opcao4 == 's') {
			simbolos += caracter;
		}

		Random aleatorio = new Random();
		for (int count = 0; count <= comprimento-1; count++) {
			int posicao = aleatorio.nextInt(0, simbolos.length());
			senhaGerada += simbolos.charAt(posicao);
		}

		System.out.println("Senha gerada foi: " + senhaGerada);
	}
}
