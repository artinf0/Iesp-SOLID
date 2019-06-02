package br.com.iesp.mba.solid.model;

import java.util.Date;

import br.com.iesp.mba.solid.enuns.Prioriade;
import br.com.iesp.mba.solid.enuns.Situacao;
import br.com.iesp.mba.solid.enuns.TipoChamado;
import br.com.iesp.mba.solid.utils.DataUtils;

public class Ocorrencia {

	private String descricao;
	private Prioriade prioridade;
	private Date dataCriacao;
	private Date dataAgendamento;
	private Integer  tempoAtendimento; // quantidade de horas
	private Categoria categoria;
	private Tecnico tecnico;
	private Situacao situacao;
	private TipoChamado tpChamado;
	private GrupoOperador grupoOperador;

	public Ocorrencia(String descricao, Prioriade prioridade, Integer tempoAtendimento, Categoria categoria, Tecnico tecnico, GrupoOperador grupoOperador, TipoChamado tpChamado) {
		this.dataCriacao = new Date();
		this.dataAgendamento = null;
		this.situacao = Situacao.REGISTRADO;
		
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.tempoAtendimento = tempoAtendimento;
		this.categoria = categoria;
		this.tecnico = tecnico;
		this.grupoOperador = grupoOperador;
		this.tpChamado = tpChamado;
		
	}
	
	
	public void atualizarSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	

	@Override
	public String toString() {
		return 
				  " Descricao: " + this.descricao + "\n"
  				+ " Grupo Operador: \n" + this.grupoOperador.toString() + "\n"
				+ "\n Tecnico: \n" + this.tecnico.toString() + "\n"
				+ "\n Prioridade: " + this.prioridade + "\n"
				+ " Data Criacao: " + DataUtils.formatarData(this.dataCriacao) + "\n"
				+ " Data Agendada: " + (this.dataAgendamento != null ? DataUtils.formatarData(this.dataAgendamento) : "") + "\n"
				+ " Tempo de Atendimento: " + this.tempoAtendimento + "\n"
				+ " Categoria: " + this.categoria.toString() + "\n"
				+ " Tipo: " + this.tpChamado.toString() + "\n"
				+ " Prioridade: " + this.prioridade + "\n"
				;
	}
	



		
}
