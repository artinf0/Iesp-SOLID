package br.com.iesp.mba.solid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.iesp.mba.solid.enuns.Situacao;
import br.com.iesp.mba.solid.utils.DataUtils;

public class Atendimento {
	
	private Date dataAlvo;
	private Cliente cliente;
	private Atendente atendente;
	private List<Equipamento> equipamentos;
	private Ocorrencia ocorrencia;
	private List<LogAtendimento> logsAtendimento;
	private PesquisaSatisfacao pesquisaSatisfacao;
	private Situacao situacao;
	
	public Atendimento(Cliente cliente, Atendente atendente) {
		this.cliente = cliente;
		this.atendente = atendente;
		this.pesquisaSatisfacao = null;
		this.ocorrencia = null;
		
		this.equipamentos = new ArrayList<Equipamento>();
		this.logsAtendimento = new ArrayList<LogAtendimento>();
		this.situacao = Situacao.REGISTRADO;
	}
	
	public void realizarInteracao(LogAtendimento log) {
		this.logsAtendimento.add(log);
	}
	
	public void utilizarEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
	}
	
	
	public void atualizarSituacao(Situacao situacao, LogAtendimento log) {
		this.situacao = situacao;
		this.logsAtendimento.add(log);
		
		if(situacao == Situacao.RESOLVIDO) {
			this.pesquisaSatisfacao = new PesquisaSatisfacao();
			this.pesquisaSatisfacao.realizarPesquisa();
		}
		
	}
		
	public void exibirLog() {
		// TODO Auto-generated method stub
		for (LogAtendimento log : logsAtendimento) {
			System.out.println(log.toString());
		}
	}
	
	@Override
	public String toString() {
		return 	 
				  " Situação: " + this.situacao.toString() + "\n"
				+ " Data Alvo: " + DataUtils.formatarData(this.dataAlvo) + "\n"
				+ " Cliente: \n" + this.cliente.toString() + "\n"
				+ "\n Atendente: \n" + this.atendente.toString() + "\n"
				+ "\n Ocorrencia: \n" + this.ocorrencia.toString() + "\n"
				+ (this.equipamentos.size() == 0 ? "" : " Equipamentos utilizados: \n" + this.equipamentos.stream().map(Equipamento::toString).collect(Collectors.joining(", "))) + "\n"
				+ "\n Pesquisa Satisfação: \n" + (this.pesquisaSatisfacao != null ? this.pesquisaSatisfacao.toString() : "")
				;
	}
	

	public void setDataAlvo(Date dataAlvo) {
		this.dataAlvo = dataAlvo;
	}
	
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}
	
}
