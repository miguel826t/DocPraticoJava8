package exemplos.enums;

import model.enums.StatusDoPedido;
/**
 * Obs: Sempre usar o valor INT nas classes quando referenciar ENUM
 * 	> INT StatusDoPedido = StatusEnum.getCode();
 * 
 * AULA: 146
 */
public class Enum {

	public static void main(String[] args) throws IllegalAccessException {
		
		//* String 2 Enum *\\
		System.out.println("Instanciar enum por string");
		StatusDoPedido sts1 = StatusDoPedido.valueOf("ENVIADO");
		System.out.println(sts1);
		
		//* Enum from int *\\		
		System.out.println("Enum instanciado por um numero");
		StatusDoPedido sts2 = StatusDoPedido.valueOf(2);
		System.out.println(sts2);
		
		//* Enum 2 int *\\
		System.out.println("Pegar o codigo referente ao enum");
		int codigo = sts2.getCode();
		System.out.println(codigo);
		
	}

}
