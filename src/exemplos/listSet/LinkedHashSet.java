package exemplos.listSet;

import java.util.Set;
/**
 * Classe exemplo de Lista tipo LinkedHashSet
 * Obs: 
 *  -> Elementos seguem a ordem que foram incluidos
 *  -> Velocidade media para Acesso/Insercao/Remocao
 *  
 * AULA: 243
 */
public class LinkedHashSet {

	public static void main(String[] args) {
		
		// Declaracao do tipo HastSet
		Set<String> listSet = new java.util.LinkedHashSet<String>();
		
		// Itens
		listSet.add("Tv");
		listSet.add("Notebook");
		listSet.add("Tablet");
		listSet.add("Celular");
		
		// Retorno (true/false)
		System.out.println(listSet.contains("Notebook"));
		
		// Remove as primeiras com T
		listSet.removeIf(i -> i.charAt(0) == 'T');
		
		// Mostra na ordem de inclusão
		for (String item : listSet) {
			System.out.println(item);
		}
	}

}
