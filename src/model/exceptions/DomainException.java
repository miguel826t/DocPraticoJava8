package model.exceptions;

/**
 * Classe de excecao personalizada
 * Obs: usada na classe Exemplo2_Boa
 * 
 * AULA: 176
 */

/* ==* Classe de excecao pode ser extendida de ...*== */
//* Exception -> Obriga na compilacao você a tratar o erro
//* RuntimeException -> Só ira dar erro na execução
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
