package exemplos;

public class Programa01 {

	public static void main(String[] args) {

		int numero = -5;

		if (numero > 0) {
			System.out.println("O número é positivo");
		}

		if (numero >= 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}

		if (numero > 0) {
			System.out.println("O número é positivo");
		} else if (numero < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O numero é igual a zero");
		}

	}

}
