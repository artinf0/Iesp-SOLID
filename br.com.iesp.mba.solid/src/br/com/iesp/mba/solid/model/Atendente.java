package br.com.iesp.mba.solid.model;

import java.util.List;

import br.com.iesp.mba.solid.enuns.TipoAtendimento;

public class Atendente extends Pessoa implements IGerenciamento<Atendente> {

	private int matricula;
	
	public Atendente() {
		super();
	}

	public Atendente(String nome, String cpf, int matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	@Override
	public Atendente salvar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Atendente> listar() {
		List<Atendente> _list = null;
				
		return _list;
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
