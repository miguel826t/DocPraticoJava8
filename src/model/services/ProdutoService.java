package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Produto;
/**
 * Classe exemplo utilizando um predicate para poder realizar uma ação
 * 
 * AULA: 258
 */
public class ProdutoService {
		public double filteredAndSumPrice(List<Produto> list, Predicate<Produto> pred) {
		Double sum = 0.0;
		for(Produto p : list) {
			if (pred.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
	}
}