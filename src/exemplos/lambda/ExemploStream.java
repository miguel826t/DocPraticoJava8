package exemplos.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream é uma solução para processar sequencias de dados
 *  -> Parallel-friendly (thread safe)
 *  -> Sem efeitos colaterais
 *  -> sob demanda (lazy evaluation)
 * Acesso sequencial (Nao há indices)
 * Single-use : só pode ser usada uma vez
 * Obs: Operacoes com stream retornam sempre novas stream
 * 
 * Operações intermediarias:
 *  -> filter
 *  -> map
 *  -> flatmap
 *  -> peek
 *  -> distinct
 *  -> sorted
 *  -> skip
 *  -> limit
 *  
 * Operacoes terminais
 *  -> forEach
 *  -> forEachOrdered
 *  -> toArray
 *  -> reduce
 *  -> collect
 *  -> min
 *  -> max
 *  -> count 
 *  -> anyMatch
 *  -> allMatch
 *  -> noneMatch
 *  -> findFirst
 *  -> findAny
 *  
 * AULA: 259
 */
public class ExemploStream {

	public static void main(String [] args) {
		
		List<Integer> list = Arrays.asList(3,4,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Miguel","Rosa","Cavalcante");
		System.out.println(Arrays.toString(st2.toArray()));
		
		List<Integer> newList = list.stream()
					.filter(x -> x % 2 == 0)
					.map(x -> x * 10)
					.collect(Collectors.toList());
		newList.forEach(x -> System.out.println(x));
		
	}
}
