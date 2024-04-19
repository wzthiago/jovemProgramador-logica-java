package exemplos;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcaoLogin = 0;
		String login = "admin";
		String senha = "root";

		while (opcaoLogin <= 2) {

			System.out.println("Digite seu login: ");
			String tentativaLogin = entrada.nextLine();

			System.out.println("Digite sua senha: ");
			String tentativaSenha = entrada.nextLine();

			if (senha.equals(tentativaSenha) && login.equals(tentativaLogin)) {

				double saldo = 6500;

				while (true) {
					System.out.println("Bem vindo " + login);

					System.out.println("1 - Para ver saldo");
					System.out.println("2 - Para realizar saque");
					System.out.println("3 - Para realizar depósito");
					int opcao = entrada.nextInt();
					entrada.nextLine();
					
					switch (opcao) {
					case 0:

						System.out.println("Saindo do programa...");
						break;

					case 1:
						System.out.println("Seu saldo é " + saldo + "\n");
						break;
					case 2:

						System.out.println("Seu saldo é " + saldo);
						System.out.println("Digite o valor do saque: ");
						double saque = entrada.nextDouble();
						entrada.nextLine();

						if (saque <= saldo && saque > 0) {

							System.out.println("Digite a senha de 4 digitos");
							String senha4 = entrada.nextLine();
							if (senha4.equals("1234")) {
								saldo = saldo - saque;
								System.out.println("Saque realizado com sucesso");
								System.out.println("Saldo atual: " + saldo);
							} else {
								System.out.println("Senha incorreta!");
							}

						}

						break;
					case 3:
						System.out.println("Seu saldo é " + saldo);
						System.out.println("Digite o valor do deosito?");
						double deposito = entrada.nextDouble();
						entrada.nextLine();

						if (deposito > 0) {
							saldo = saldo + deposito;
							System.out.println("Deposito realizado com sucesso");
							System.out.println("Saldo atual " + saldo);

						} else {
							System.out.println("Valor inválido");
						}

						break;

					default:
						System.out.println("Digite uma opção válida");
						break;
					}

					System.out.println("Você deseja fazer uma nova operação? [s/n]");
					char letra = entrada.nextLine().charAt(0);
					if (letra == 'n') {
						System.out.println("Até logo");
						break;
					}
				}

			} else {
				System.out.println("Credenciais inválidas, saindo...");
				opcaoLogin++;
				if (opcaoLogin == 3) {
					System.out.println("Você errou três vezes seu Login e senha, usuário bloqueado.");
				}

			}
		}

	}

}
