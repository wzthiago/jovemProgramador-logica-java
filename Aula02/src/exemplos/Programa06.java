package exemplos;

public class Programa06 {

	public static void main(String[] args) {

		// escopo de variável
		int numero = 10;
		if (numero > 0) {
			int segundoNum = 15;
			int soma = numero + segundoNum;
			System.out.println("A soma deu " + soma);
		}

		// variavel soma está apenas dentro do escopo do if
		// System.out.println("A soma deu " + soma);

	}

}
