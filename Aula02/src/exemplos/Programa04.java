package exemplos;

public class Programa04 {

	public static void main(String[] args) {
		
		int numero = 10;
		
		if(numero > 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}

		//if ternário (if em uma linha)
		String resultado = (numero > 0) ? "Positivo" : "Negativo";
		System.out.println(resultado);
		
		/*
		 * String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" :
		 * "zero";
		 */		
	}

}
