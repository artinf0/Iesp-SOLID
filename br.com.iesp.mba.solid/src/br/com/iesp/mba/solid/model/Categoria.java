package br.com.iesp.mba.solid.model;

public class Categoria {
	
	private String nome;
	private SubCategoria subcategoria;

	public Categoria(String nome, SubCategoria subcategoria) {
		super();
		this.nome = nome;
		this.subcategoria = subcategoria;
	}

	@Override
	public String toString() {
		return nome + "; Subcategoria: " + subcategoria.toString();
	}
	
	

	
}
