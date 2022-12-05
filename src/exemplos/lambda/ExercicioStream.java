package exemplos.lambda;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import model.entities.Produto;
/**
 * Classe exemplo Function
 *  -> Aplicar uma funcao para a list usando MAP
 *  -> MAP só pode ser usada com Stream
 *  
 * AULA: 257
 */
public class ExercicioStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(ExercicioStream.class.getResource("CsvProdutos.txt").getFile()))){
			
			List<Produto> produtos = new ArrayList<Produto>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				produtos.add(new Produto(produtos.size()+1,fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Double media = produtos.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (x,y) -> x+y)/produtos.size();
			System.out.println("Media dos preços:" + String.format("%.2f", media));
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> produtosAbaixoMedia = produtos.stream()
					.filter(p -> p.getPreco() < media)
					.map(p -> p.getNome())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			produtosAbaixoMedia.forEach(System.out::println);
			
			
		}catch (Exception e) {
			System.err.println("Falta: " + e.getMessage());
		}
		
		
	}

}
