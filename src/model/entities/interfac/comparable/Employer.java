package model.entities.interfac.comparable;
/**
 * Classe com implementacao da interface Comparable
 * que é usada para comparar campos e retonar valor
 * Valor > 0 -> Objeto é maior
 * Valor < 0 -> Objeto é menor
 * Valor = 0 -> Os objetos sao iguais
 * 
 * AULA: 234
 */
public class Employer implements Comparable<Employer>{

	private String name;
	private Double salary;
	
	public Employer(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Implementacao do metodo
	@Override
	public int compareTo(Employer other) {
		
		// Nome em ordem A,B,C,D
		return name.compareTo(other.getName());
		
		// Nome em ordem D,C,B,A ("-" antes do retorno)
		//return -name.compareTo(other.getName());
	}

}
