package br.com.iesp.mba.solid.model;

public class Equipamento {

	private String nome;

	public Equipamento(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return " " + nome;
	}

	
}
