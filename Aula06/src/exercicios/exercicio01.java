package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio01 {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Quanto funcionários deseja cadastrar? ");
		int qntFuncionarios = input.nextInt();
		
		List<Integer> id = new ArrayList<>(qntFuncionarios);
		List<String> nome = new ArrayList<>(qntFuncionarios);
		List<Double> salario = new ArrayList<>(qntFuncionarios);
		
		
		
	}

}
