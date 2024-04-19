package exemplos;

public class Programa09 {

	public static void main(String[] args) {

		String palavra = "programador";

		for (int count = 0; count < palavra.length(); count++) {

			char letra = palavra.charAt(count);

			System.out.println("Posição " + count + ", Letra - " + letra);

			//if (letra == "m") {
			//	System.out.println(letra + "Letra encontrada na posição " + count);
			//}
		}

	}

}
