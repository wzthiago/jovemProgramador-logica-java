package exemplos;
public class Programa09 {

	public static void main(String[] args) {
		
		//[linhas][colunas]
		int matriz [][]=  new int[3][4];

		//Inserindo um valor na minha matriz
		matriz[1][2] = 200;		
		matriz[2][1] = 8;		
		
		//Buscando o tamanho do vetor
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
		
	}

}