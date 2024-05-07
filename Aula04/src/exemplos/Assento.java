package exemplos;

public class Assento {

	public static void main(String[] args) {

		int assentos[][] = { 
				{ 0, 0, 1, 1 }, 
				{ 0, 0, 0, 1 }, 
				{ 0, 0, 0, 1 },
				{ 1, 0, 0, 0 }
				};

		// 0 ocupado
		// 1 disponível
		if (assentos[2][2] == 1) {
			boolean disponivel = assentos[2][2] == 1;
			System.out.println("Assento disponível");
		} else {
			System.out.println("Assento disponível");

		}

	}

}
