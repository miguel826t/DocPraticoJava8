package model.entities.interfac;
/**
 * Classe com a logica do negocio de como sera calculado os precos
 * 
 * AULA: 227
 */
import java.time.Duration;

public class AluguelService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	public ITaxaServico taxService;
	
	public AluguelService(Double pricePerHour, Double pricePerDay,ITaxaServico taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void ProcessarAluguel(AlugarCarro aluguel) {
		double minutes = Duration.between(aluguel.getStart(), aluguel.getFinish()).toMinutes();
		double hours = minutes /60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		double tax = taxService.taxa(basicPayment);
		
		aluguel.setFatura(new Fatura(basicPayment,tax));
	}
}
