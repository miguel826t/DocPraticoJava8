package model.entities;

import java.util.Objects;

import javax.management.InvalidAttributeValueException;

public class Produto implements Comparable<Produto>{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String  nome;
	private Integer estoque;
	private Double  preco;
	
	/* ======* Construtor *====== */
	public Produto(Integer id, String nome, Double preco) {
		this.id      = id;
		this.nome    = nome;
		this.preco   = preco;
		this.estoque = 0;
	}
	
	/* ======* hashCode and equals *====== */
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	/* ======* Gets and Sets *====== */
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void depositarEstoque(Integer valorEntrada) {
		this.estoque += valorEntrada;
	}
	public void retirarEstoque(Integer valorSaida) throws InvalidAttributeValueException{		
		if (valorSaida > estoque)
			throw new InvalidAttributeValueException("Valor de saida maior que valor atual em estoque");
		this.estoque = valorSaida;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	

	/* ======* Metodos *====== */
	@Override
	public int compareTo(Produto p) {
		return nome.toUpperCase().compareTo(p.nome.toUpperCase());
	}
	
	
	
	
}
