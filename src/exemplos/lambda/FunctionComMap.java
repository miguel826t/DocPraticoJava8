package exemplos.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Produto;

/**
 * Classe exemplo Function
 *  -> Aplicar uma funcao para a list usando MAP
 *  -> MAP só pode ser usada com Stream
 *  
 * AULA: 257
 */
public class FunctionComMap {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto(1,"Microsoft", 103.00));
		list.add(new Produto(2,"Twtter", 154.00));
		list.add(new Produto(3,"BrisinGamen", 35698.00));
		list.add(new Produto(4,"Ipecacuanha", 245.00));
		
		// Funcao que recebe produto e retorna String
		Function<Produto, String> func = p -> p.getNome().toUpperCase();
		// Converte a list para Stream e depois para lista denovo
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		//in-line
		names = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		
		names.forEach(System.out::println);
	}
}
