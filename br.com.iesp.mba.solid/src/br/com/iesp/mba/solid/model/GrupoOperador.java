package br.com.iesp.mba.solid.model;

import java.util.ArrayList;
import java.util.List;

import br.com.iesp.mba.solid.utils.DataUtils;

public class GrupoOperador {
	
	private String nomeGrupo;
	private Integer prazo; // em horas
	private boolean atendimentoExterno;
	private List<Tecnico> tecnicos;
	private Double valorOcorrencia;
	
	public GrupoOperador(String nomeGrupo, Integer prazo, boolean atendimentoExterno, Double valorOcorrencia) {
		this.tecnicos = new ArrayList<Tecnico>();
		
		this.nomeGrupo = nomeGrupo;
		this.prazo = prazo;
		this.atendimentoExterno = atendimentoExterno;
		this.valorOcorrencia = valorOcorrencia;
	}
	
	public void adicionarTecnico(Tecnico tecnico) {
		this.tecnicos.add(tecnico);
	}
	
	
	@Override
	public String toString() {
		return 
				  " Nome: " + this.nomeGrupo + "\n"
  				+ " Prazo: " + this.prazo + "\n"
  				+ " Atendimento Externo: " + (this.atendimentoExterno == true ? "Sim" : "Não") + "\n"
  				+ " Valor Ocorrencia: " + this.valorOcorrencia
				;
	}
	
	
	
	
}
