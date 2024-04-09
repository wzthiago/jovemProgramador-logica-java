package exemplos;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		do {
				
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		entrada.nextLine();//limpando o buffer, pois ele joga o \n direto na variável operação
		
		System.out.println("Digite a operação desejada: [+,-,*,/]");
		char operacao = entrada.nextLine().charAt(0);

		//char operacao = '/';
		double resultado = 0;

		if (operacao == '+') {
			resultado = num1 + num2;
		} else if (operacao == '-') {
			resultado = num1 - num2;
		}else if(operacao == '*'){
			resultado = num1 * num2;
		} else if (operacao == '/') {
			// IF aninhado
			if (num2 != 0) {
				resultado = (double)num1 / num2;
			} else {
				System.out.println("ERRO!!! Divisao por zero!");
				return;
			}

		}
		
		System.out.println("O resultado é " + resultado+"\n");
		
		System.out.println("Deseja continuar?\n 0 - Para Sair\n 1 - Para continuar");
		opcao = entrada.nextInt();
		
		}while(opcao != 0);
		
		 entrada.close();
		 
			/*
			 * //Com SWITCH CASE
			 * 
			 * switch (key) { case value:
			 * 
			 * break;
			 * 
			 * default: break; }
			 */
}
}
