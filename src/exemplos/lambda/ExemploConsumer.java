package exemplos.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Produto;
/**
 * Classe exemplo de consumer
 * para aplicacao de uma logica a uma lista
 * 
 * AULA: 256
 */
public class ExemploConsumer {
	public static void main(String [] args) {
		
		Double porcentagem = 0.5;
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto(1,"Microsoft", 103.00));
		list.add(new Produto(2,"Twtter", 154.00));
		list.add(new Produto(3,"BrisinGamen", 35698.00));
		list.add(new Produto(4,"Ipecacuanha", 245.00));
		
		// Metodo do consumer
		Consumer<Produto> cons = p -> {
			p.setPreco(p.getPreco() * (porcentagem + 1));
		};
		list.forEach(cons);
		
	
		// Mostrar a lista
		list.forEach(System.out::println);
	}
}
