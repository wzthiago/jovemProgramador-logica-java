package br.com.jovemprogramador.aplicacao;

import java.util.Scanner;

import model.Triangulo;

public class Programa02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite os valores para o Triangulo X");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		Triangulo trianguloX = new Triangulo();
		trianguloX.ladoA = a;
		trianguloX.ladoB = b;
		trianguloX.ladoC = c;

		System.out.println("Digite os valores para o Triangulo Y");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		Triangulo trianguloY = new Triangulo();
		trianguloY.ladoA = a;
		trianguloY.ladoB = b;
		trianguloY.ladoC = c;
		
		trianguloX.calcularArea();
		trianguloY.calcularArea();

	}

}
