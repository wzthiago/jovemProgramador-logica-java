package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanhoVetor = input.nextInt();
		int vetor[] = new int[tamanhoVetor];

		for (int count = 0; count < vetor.length; count++) {
			System.out.println("Digite o " + (count + 1) + "ª número: ");
			vetor[count] = input.nextInt();

		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	}

}
