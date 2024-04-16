package exemplos;

import java.util.Scanner;

public class programa04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double totalConta = 0;
		int escolha = 0;

		while (true) {

			System.out.println("Bem vindo");
			System.out.println("1 - Pizza (R$ 25.00)");
			System.out.println("2 - Hamburguer (R$ 15.00)");
			System.out.println("3 - Refrigerante (R$ 5.00)");
			System.out.println("4 - Finalizar pedido");
			System.out.println("Escolha uma opção válida (1, 2, 3 , 4)");

			escolha = input.nextInt();

			if (escolha == 1) { 
				System.out.println("Pizza adicionada com sucesso");
				totalConta += 25;
			} else if (escolha == 2) {
				System.out.println("Hamburguer adicionada com sucesso");
				totalConta += 15;
			} else if (escolha == 3) {
				System.out.println("Refrigerante adicionada com sucesso");
				totalConta += 5;
			} else if (escolha == 4) {
				System.out.println("Pedido Finalizado!");
				System.out.println("Total a pagar R$: " + totalConta);
				break;
			}else {
				System.out.println("");
			}
		}
	}
}
