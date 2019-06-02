package br.com.iesp.mba.solid.model;

import java.util.List;

import br.com.iesp.mba.solid.enuns.TipoAtendimento;

public interface IGerenciamento <T> {

	public T salvar();
	
	public boolean remover();
	
	public List<T> listar();
		
	public Atendimento manipularAtendimento(TipoAtendimento tp );
}
