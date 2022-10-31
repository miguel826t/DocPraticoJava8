package model.entities.interfac;
/**
 * Classe com a implementacao do aluguel de carros
 * 
 * AULA: 227
 */
import java.time.LocalDateTime;

public class AlugarCarro {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Carro carro;
	private Fatura fatura;
	
	public AlugarCarro() {
		
	}

	public AlugarCarro(LocalDateTime start, LocalDateTime finish, Carro carro) {
		super();
		this.start = start;
		this.finish = finish;
		this.carro = carro;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
}
