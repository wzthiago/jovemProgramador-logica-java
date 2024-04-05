package exemplos;

import java.util.Scanner;

public class impostoRenda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua renda bruta: ");
		double rendaBruta = entrada.nextDouble();
		
		System.out.println("Quantos dependentes? ");
		int numDependentes = entrada.nextInt();
		
		double rendaTributavel = rendaBruta - 10000 - (3000 * numDependentes);
		double imposto = rendaTributavel * 20/100;
		System.out.println("Valor a ser pago: " + imposto);
		
		entrada.close();

	}

}
