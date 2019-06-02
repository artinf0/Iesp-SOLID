package br.com.iesp.mba.solid.model;

import java.util.List;

import br.com.iesp.mba.solid.enuns.TipoAtendimento;

public class Tecnico extends Pessoa implements IGerenciamento<Tecnico>{
	
	private Integer matricula;
	private Integer centoCusto;	
			
	public Tecnico(String nome, String cpf, Integer matricula, Integer centoCusto) {
		super(nome, cpf);
		this.matricula = matricula;
		this.centoCusto = centoCusto;
	}
	
	@Override
	public Tecnico salvar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Tecnico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atendimento manipularAtendimento(TipoAtendimento tp) {

		return null;
		
	}

	@Override
	public String toString() {
		return " Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Matricula: " + this.matricula;
	}
	

}
