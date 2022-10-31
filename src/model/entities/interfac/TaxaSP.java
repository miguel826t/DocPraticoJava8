package model.entities.interfac;
/**
 * Implementacao da Interface ITaxaServico
 * 
 * AULA: 227
 */
public class TaxaSP implements ITaxaServico{
	
	public double taxa(double valor) {
		if(valor <= 100) {
			return valor * 0.2;
		}else {
			return valor * 0.15;
		}
	}
}
