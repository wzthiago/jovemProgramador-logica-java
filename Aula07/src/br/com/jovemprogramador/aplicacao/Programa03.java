package br.com.jovemprogramador.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;

public class Programa03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Produto " + (i + 1));
			System.out.println("Nome: ");
			String nome = input.nextLine();
			System.out.println("Preço: ");
			Double preco = input.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = input.nextInt();
			input.nextLine();

			Produto produto = new Produto(nome, preco, quantidade);
			produtos.add(produto);

			/*
			 * Não preciso fazer dessa forma quando crio meu construtor Produto produto =
			 * new Produto(); produto.nome = nome; produto.preco = preco; produto.quantidade
			 * = quantidade;
			 */
		}

		// FOR EACH para mastrar as caracteristicas do produto
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

		// Pegar um produto em específico
		Produto produto = produtos.get(0);
		System.out.println("Digite a quantidade a adicionar no estoque");
		int quantidade = input.nextInt();
		produto.adicionarEstoque(quantidade);
		System.out.println(produto);

		System.out.println("Digite a quantidade a remover no estoque");
		quantidade = input.nextInt();
		produto.removerEstoque(quantidade);
		System.out.println(produto);

	}

}
