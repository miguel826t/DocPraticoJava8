package exemplos.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Produto;
/**
 * Classe exemplo lambda predicate
 *  
 * AULA: 255
 */
public class ExemploPerdicate {
	public static void main(String [] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto(1,"Microsoft", 103.00));
		list.add(new Produto(2,"Twtter", 154.00));
		list.add(new Produto(3,"BrisinGamen", 35698.00));
		list.add(new Produto(4,"Ipecacuanha", 245.00));
		
		// Interface predicate verbosa		
		Predicate<Produto> pred = new Predicate<Produto>() {
			@Override
			public boolean test(Produto p) {
				return p.getPreco() <= 160;
			}
		};
		list.removeIf(pred);
		//*******
		list.removeIf(p -> p.getPreco() >= 300);
		
		
		
		// Mostrar a lista 
		list.forEach(p -> System.out.println(p.toString()));
	}	
}
