package exemplos;

public class Programa08 {

	public static void main(String[] args) {

		for (byte count = 0; count <= 10; count++) {
			System.out.println("contador = " + count);
			if (count == 5) {
				System.out.println(count + " encontrado");
				break;
			}

			int i = 0;
			while (i <= 10) {
				System.out.println(i + "");
				i++;
			}
		}
	}
}
