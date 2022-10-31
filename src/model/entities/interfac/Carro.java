package model.entities.interfac;
/**
 * Carro
 * 
 * AULA: 227
 */
public class Carro {
	
	private String model;
	
	public Carro() {
		
	}
	
	public Carro(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String odel) {
		this.model = odel;
	}
}
