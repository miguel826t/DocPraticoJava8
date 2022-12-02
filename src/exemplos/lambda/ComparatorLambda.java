package exemplos.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Produto;
/**
 *  Classe com exemplos de expressao lambda
 * 	Programação funcional
 * 
 * AULA: 252
 */
public class ComparatorLambda {
	
	public static void main(String [] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto(1,"Microsoft", 103.00));
		list.add(new Produto(2,"Twtter", 154.00));
		list.add(new Produto(3,"Alopra", 354.00));
		list.add(new Produto(4,"Ipecacuanha", 245.00));
		
		// Versão verbosa da função (Classe anonima)
		Comparator<Produto> versaoVerbosa = new Comparator<Produto>() {
			@Override
			public int compare(Produto p1, Produto p2) {
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()); 
			}
		};

		// Versão mais simplificada (Lambda COM chaves)
		Comparator<Produto> versaoMenosVerbosa = (p1,p2) -> {
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		}; 
		
		// Versão mais simplificada (Lambda SEM chaves)
		Comparator<Produto> versaoSimple = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		
		list.sort(versaoVerbosa);
		list.sort(versaoMenosVerbosa);
		list.sort(versaoSimple);
		
		// Versão com implementacao direta no argumento
		list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
	
		
		// Mostrar a lista ordenada
		list.forEach(p -> System.out.println(p.toString()));
	}	
}
