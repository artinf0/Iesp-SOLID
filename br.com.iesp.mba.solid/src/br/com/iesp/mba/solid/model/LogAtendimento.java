package br.com.iesp.mba.solid.model;

import java.util.Date;

import br.com.iesp.mba.solid.utils.DataUtils;

public class LogAtendimento {
	private Date dataContato;
	private Pessoa operador; 
	private String historico;
	
	public LogAtendimento() {}

	public LogAtendimento(Date dataContato, Pessoa operador, String historico) {
		this.dataContato = dataContato;
		this.operador = operador;
		this.historico = historico;
	}
	
	@Override
	public String toString() {
		return " Data: " + DataUtils.formatarData(this.dataContato) + ", Operador: " + this.operador.getNome() + ", Historico: " + historico;
	}
	
}
