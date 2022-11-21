package exemplos.interfac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import model.entities.interfac.comparable.Employer;

/**
 * Programa para mostrar ordenar lista
 * com Sort e interface Comparable.
 * 
 * AULA: 234
 */
public class SortListComInterfacComparable {

	public static void main(String[] args) {

		// A lista
		List<Employer> employers = new ArrayList<>();

		// Populando a lista
		CarregarEmployer(employers);
		
		// ordenar a lista
		Collections.sort(employers);
		for(Employer e : employers) {
			System.out.println(e.getName()+","+e.getSalary());
		}
	}

	public static void CarregarEmployer(List<Employer> employers) {
		employers.add(new Employer("A", 1.0));
		employers.add(new Employer("X", 5.0));
		employers.add(new Employer("V", 10.0));
		employers.add(new Employer("B", 9.0));
		employers.add(new Employer("T", 6.0));
		employers.add(new Employer("N", 65.0));
		employers.add(new Employer("G", 76.0));
		employers.add(new Employer("C", 32.0));
		employers.add(new Employer("F", 25.0));
	}

}
