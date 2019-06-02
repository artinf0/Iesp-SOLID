package br.com.iesp.mba.solid.model;

import java.util.Scanner;

import br.com.iesp.mba.solid.utils.DataUtils;

public class PesquisaSatisfacao {

	private Integer nivelSatisfacao;
	private String comentario;
	
	public PesquisaSatisfacao() {
		super();
	}
	
	public void realizarPesquisa() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Como foi sua experiência? Informe um numero entre 1 e 10 para classificar.");
			this.nivelSatisfacao = Integer.parseInt(sc.nextLine());
		} while (!(nivelSatisfacao >= 1 & nivelSatisfacao <= 10));
		
		System.out.println("Deixe um comentario.");
		this.comentario = sc.nextLine();
		
		sc.close();
	}

	@Override
	public String toString() {
		return 	 
				  " Nivel de Satisfacao: " + this.nivelSatisfacao + "\n"
				+ " Comentario: " + comentario
				;
	}
		

}
