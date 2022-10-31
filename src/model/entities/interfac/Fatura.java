package model.entities.interfac;

/**
 * Classe com os metodos de calcular o pagamento total
 * 
 * AULA: 227
 */
public class Fatura {
	
	private Double basicPayment;
	private Double tax;
	
	public Fatura() {
	}

	public Fatura(Double basicPayment, Double tax) {
		super();
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
