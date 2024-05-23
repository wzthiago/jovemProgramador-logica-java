package br.com.jovemprogramador.aplicacao;

import java.util.Scanner;

import model.Pessoa;

public class Programa05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		String nome = input.nextLine();
		System.out.println("Digite a altura:");
		double altura = input.nextDouble();
		System.out.println("Digite a idade:");
		int idade = input.nextInt();
		System.out.println("Digite o Peso:");
		double peso = input.nextDouble();
		
		Pessoa pessoa =  new Pessoa(nome, altura, idade, peso);
		System.out.println(pessoa);
		pessoa.calcularImc(peso, altura);
		System.out.println("É maior de idade? --> " + pessoa.maiorDeIdade(idade));
		
		
		

	}

}
