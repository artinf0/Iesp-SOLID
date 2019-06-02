package br.com.iesp.mba.solid.model;

import java.util.List;

import br.com.iesp.mba.solid.enuns.TipoAtendimento;

public class Cliente extends Pessoa implements IGerenciamento<Cliente>{

	private String email;
	private String endereco;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, String email, String endereco) {
		super(nome, cpf);
		this.email = email;
		this.endereco = endereco;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public Cliente salvar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Atendimento manipularAtendimento(TipoAtendimento tp) {

		return null;
	}



	@Override
	public String toString() {
		return " Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Endereco: " + this.getEndereco() + "\n Email: " + this.email;
	}

	
	
}
