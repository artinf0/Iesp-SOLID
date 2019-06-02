package br.com.iesp.mba.solid.model;

public class SubCategoria {

	private String nome;
	private ItemCategoria itemCategoria;

	public SubCategoria(String nome, ItemCategoria itemCategoria) {
		super();
		this.nome = nome;
		this.itemCategoria = itemCategoria;
	}

	@Override
	public String toString() {
		return nome + ", Item: " + this.itemCategoria.toString();
	}
	

	
	
	
}
