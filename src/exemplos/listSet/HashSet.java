package exemplos.listSet;

import java.util.Set;

/**
 * Classe exemplo de Lista tipo HashSet
 * Obs: 
 * 	-> Não admite repetições
 *  -> Elementos não possuem posição
 *  -> Mais rapido para Acesso/Insercao/Remocao
 *  
 * Metodos do Set
 *  -> add(obj), remover(obj), contains(obj) : baseados em equals e hastCode
 *  -> clear() : Reseta a lista
 *  -> size() : retorna tamanho
 *  -> removerif(predicado) -> remove da lista tudo que atende a condicao/lambda
 *  -> addAll(other)     : Uniao, Adiciona os elementos dessa lista
 *  -> retainAll(other)  : Intersecao : remove os elementes nao contidos em other
 *  -> removeAll(other)  : remove do conjunto todos os elementos contidos em other        
 *  
 * AULA: 243
 */
public class HashSet {

	public static void main(String[] args) {
		
		// Declaracao do tipo HastSet
		Set<String> listSet = new java.util.HashSet<String>();
		
		// Itens
		listSet.add("Tv");
		listSet.add("Notebook");
		listSet.add("Tablet");
		listSet.add("Celular");
		
		// Retorno (true/false)
		System.out.println(listSet.contains("Notebook"));
		
		// Remove as primeiras com T
		listSet.removeIf(i -> i.charAt(0) == 'T');
				
		// Lista não possui ordenacao
		for (String item : listSet) {
			System.out.println(item);
		}
	}
}
