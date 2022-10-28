package model.enums;

public enum StatusDoPedido {
	PENDENTE(1),
	PROCESSANDO(2),
	ENVIADO(3),
	ENTREGUE(4);
	
	private int code;
	
	private StatusDoPedido(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static StatusDoPedido valueOf(int code) throws IllegalAccessException {
		for(StatusDoPedido sts : StatusDoPedido.values()) {
			if (sts.getCode() == code) {
				return sts;
			}
		}
		throw new IllegalAccessException("Código informado não corresponde a nenhum status.");
	}
}
