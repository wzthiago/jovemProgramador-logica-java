package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Programa01 {

	public static void main(String[] args) {
		
		// Inicializando uma lista
		List <Integer> listaNumeros =  new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		System.out.println("Valor: " +listaNumeros);
		
		// Inicializando uma lista com valores
		List<Integer> listaDecimais = new ArrayList<>(List.of(3, 2, 1, 0));
		System.out.println(listaDecimais);
		
		// Lista de String
		List<String> listaNomes = new ArrayList<>();
		listaNomes.add("Maria");
		listaNomes.add("Meg");
		listaNomes.add("Bob");
		listaNomes.add("Charlie");
		// Imprimindo a lista
		System.out.println(listaNomes);
		
		// Buscando elemento da posição 2
		String nome = listaNomes.get(2);
		System.out.println(nome);
		
		// Adicionando um elemento em uma posição específica
		listaNomes.add(3, "Novo elemento");
		System.out.println(listaNomes);
		
		// Percorrendo uma lista
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println("Posição "+i+" -> elemento: "+listaNomes.get(i));
		}
		
		// For EACH
		for(String name : listaNomes) {
			System.out.println(name);
		}
			
		// Removendo pelo elemento
		listaNomes.remove("Meg");
		System.out.println(listaNomes);
			
		// Removendo pela posição
		listaNomes.remove(0);
		System.out.println(listaNomes);
		
		// Lista de numeros
		System.out.println(listaNumeros);
		listaNumeros.remove(Integer.valueOf(5));
		System.out.println(listaNumeros);
		
		// Removendo todos os nomes que comecem com N
		listaNomes.removeIf(i -> i.charAt(0) == 'M');
		System.out.println(listaNomes);
		
		// Atualizando elemento de uma posição específica
		listaNomes.set(0, "Charles");
		System.out.println(listaNomes);
		
		// Segunda lista de nomes
		List<String> listaNomes02 = new ArrayList<>();
		listaNomes02.add("Teste");
		listaNomes02.add("Testando");
		
		// Juntando em uma lista só
		listaNomes.addAll(listaNomes02);
		System.out.println(listaNomes);
		
		// Ordenação
		listaNomes.sort(null);
		System.out.println(listaNomes);
		
		// Encontrar o indice do elemento
		int indice = listaNomes.indexOf("Charlie");
		System.out.println("Charlie está na posição: "+indice);
	
		// Verificando existencia
		boolean existe = listaNomes.contains("Teste");
		System.out.println("Teste existe? "+existe);
		
		
		
	}
}
