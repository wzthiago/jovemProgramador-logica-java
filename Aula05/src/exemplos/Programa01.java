package exemplos;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
	int numero1 = 5;
	int numero2 = 25;
	
		
	int res = somar(numero1, numero2);
	System.out.println("Resultado: "+res);

	}

	public static int somar(int num1, int num2) {
		int resultado = 0;
		resultado = num1 + num2;
	
		return resultado;
	}
	
	public static int somar(int num1, int num2, int num3) {
		int resultado = 0;
		resultado = num1 + num2 + num3;
	
		return resultado;
	}

	



}
