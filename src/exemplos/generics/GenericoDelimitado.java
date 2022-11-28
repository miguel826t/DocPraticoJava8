package exemplos.generics;

import java.util.ArrayList;
import java.util.List;

import model.entities.generic.CalculationService;
/**
 * Obs: Classe utilizada mode.entities.generic.CalculationService
 * 
 * AULA: 239
 */
public class GenericoDelimitado {

	public static void main(String[] args) {
		
// EXEMPLO 1 ************
		// Lista concreta
		List<Integer> listInt = new ArrayList<>();
		
		// Add itens da lista
		listInt.add(3);
		listInt.add(7);
		listInt.add(1);
		listInt.add(4);
		listInt.add(2);
		listInt.add(5);
		listInt.add(6);
		
		// Utilizando metodo concreto
		Integer numeroMaior = CalculationService.max(listInt);
		
		// Mostra o obj maior da lista
		System.out.println(numeroMaior);
// *********************
// EXEMPLO 1 ************
		// Lista concreta
		List<String> listString = new ArrayList<>();
		
		// Add itens da lista
		listString.add("C");
		listString.add("G");
		listString.add("A");
		listString.add("D");
		listString.add("B");
		listString.add("F");
		listString.add("E");
		listString.add("H");
		
		// Utilizando metodo concreto
		String StringMaior = CalculationService.max(listString);
		
		// Mostra o obj maior da lista
		System.out.println(StringMaior);
// *********************		
		
		
		
	}
}
