package br.com.iesp.mba.solid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.iesp.mba.solid.enuns.Prioriade;
import br.com.iesp.mba.solid.enuns.Situacao;
import br.com.iesp.mba.solid.enuns.TipoChamado;
import br.com.iesp.mba.solid.model.*;

public class MainProblema {
	
	

	public static void main(String[] args) {

		//Tecnico e Grupo			
		Tecnico tecnico = new Tecnico("Pepiopsocopsuly Diniz", "666.555.444-56", 2000, 1010);
		GrupoOperador goLimpezaManutecao = new GrupoOperador("Limpeza e Manutenção", 16, true, 50.00);
		goLimpezaManutecao.adicionarTecnico(tecnico);
		
		//Categoria
		Categoria categoria1 = new Categoria(
				"Hardware"
				, new SubCategoria(
						"Componentes", 
						new ItemCategoria("Limpeza")
						)
				);
		
		
		// Criando Cliente
		Cliente cliente = new Cliente("Carlos Gomes", "000.123.546-99", "teste@teste.com", "Rua teste");
		System.out.println("====== Cadastro de cliente ====== ");	
		System.out.println(cliente.toString());
		
		
		
		// Criando Atendente
		Atendente atendente = new Atendente("Maria das Dores", "123.456.999-88", 1515);
		System.out.println("\n\n\n====== Cadastro de Atendente ====== ");
		System.out.println(atendente.toString());

		

		// Inicia o atendimento		
		Atendimento atendimento = new Atendimento(cliente, atendente);
		atendimento.realizarInteracao(new LogAtendimento(new Date(), atendente, "Primeiro Atendimento."));
		atendimento.setDataAlvo(new Date());
		// Cria OS
		atendimento.atualizarSituacao(Situacao.EM_ANDAMENTO, new LogAtendimento(new Date(), atendente, "Solicitação de Limpeza. Necessario visita tecnica."));
		atendimento.setOcorrencia(new Ocorrencia(
				  "Cliente deseja realizar uma limpeza em seu computador pessoal."
				, Prioriade.MEDIA
				, 16 //horas
				, categoria1
				, tecnico
				, goLimpezaManutecao
				, TipoChamado.SOLICITACAO
				));
		
		System.out.println("\n\n\n====== Cadastro de OS ====== ");	
		System.out.println(atendimento.toString());
		
		
		
		
		
		// Resolver OS/Atendimento
		atendimento.utilizarEquipamento(new Equipamento("Pasta Termica"));
		atendimento.utilizarEquipamento(new Equipamento("Chaves de Fenda"));
		atendimento.utilizarEquipamento(new Equipamento("Parafusos"));
		atendimento.getOcorrencia().atualizarSituacao(Situacao.RESOLVIDO);
		atendimento.realizarInteracao(new LogAtendimento(new Date(), tecnico, "Realizado limpeza em todos os componentes do computador."));
		atendimento.atualizarSituacao(Situacao.RESOLVIDO, new LogAtendimento(new Date(), atendente, "Tecnico realizou operação solicitada."));
		System.out.println("\n\n\n====== Resolver OS ====== ");
		System.out.println(atendimento.toString());
		
		
		
		
		
		// Listar Historico	
		System.out.println("\n\n\n====== Historico ====== ");	
		atendimento.exibirLog();	
		

	}

}
