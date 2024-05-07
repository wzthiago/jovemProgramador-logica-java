package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		byte opcao = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		opcao = scanner.nextByte();

		int vetorInt[] = new int[opcao];

		for (int count = 0; count < vetorInt.length; count++) {
			System.out.println("Digite a " + (count + 1) + "ª posição do vetor: ");
			opcao = scanner.nextByte();
			vetorInt[count] = opcao;
		}

		int negativos = 0;
		for (int i = 0; i < vetorInt.length; i++) {
			if (vetorInt[i] < 0) {
				System.out.println(vetorInt[i]);
				negativos++;
			}
		}
		System.out.println("Quantidade de números negativos: " + negativos);
		
		if (negativos == 0) {
			System.out.println("Não foi inserido nenhum valor negativo");
		}
	}
}
