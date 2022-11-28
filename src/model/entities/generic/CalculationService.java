package model.entities.generic;

/**
 * AUTHOR. M.R.C. - 11/22.
 *
 * Classe com metodo generico
 * AULA: 239
 */

import java.util.List;

public class CalculationService {
		
	// Para comparar precisa do metodo Comparable então a classe generica T precisa implementar 
	// esse metodo, para garantir isso se usa (T extends Comparable) ou alguma classe super dela precisa ter o metodo (? super T)
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty())
			throw new IllegalStateException("Lista está vazia.");
		
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) 
				max = item;
		}
		return max;
	}
}
