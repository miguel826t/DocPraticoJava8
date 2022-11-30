package exemplos.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import model.entities.Produto;

/**
 * Classe exemplo de Map<K,V> tipo HashMap
 * Obs: 
 * 	-> Não admite repetições
 *  -> Elementos não possuem posição
 *  -> Mais rapido para Acesso/Insercao/Remocao
 *  
 * Metodos do Set
 *  -> put(obj), remove(obj), containsKey(obj), get(key): baseados em equals e hastCode
 *  -> clear()  : Reseta a lista
 *  -> size()   : Retorna tamanho
 *  -> keySet() : 
 *  -> values() :         
 *  
 * AULA: 248
 */
public class ExemploHastMap {

	public static void main(String[] args) {
		
		Map<String,Object> componentes = new TreeMap<>();
		
		componentes.put("nome","BpBook");
		componentes.put("preco",100);
		
		Produto pr = new Produto(1, "BpBook", 100.0);
		System.out.println("Chave: " + componentes.containsKey("nome"));
		
		for (String key : componentes.keySet()) {
			System.out.println(key +": " + componentes.get(key));
		}
		
	}
}
