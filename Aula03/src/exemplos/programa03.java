package exemplos;

import java.util.Scanner;

public class programa03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número para ver a tabuada");
		int numero = input.nextInt();
		int multiplicador = 1;
		while (multiplicador <= 10) {
			int resultado = numero * multiplicador;
			
			System.out.println(numero + " x " +multiplicador+ " = " + resultado);
			multiplicador++;
		}
	}

}
