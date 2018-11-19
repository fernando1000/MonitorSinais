package br.com.x10d.monitorsinais.model;

import java.util.HashMap;

public class StatusVeiculo {

	HashMap<String, String> lista; 
	
	public StatusVeiculo() {
		
		lista = new HashMap<String,String>();
		lista.put("U", "Desconhecido");
		lista.put("D", "Desativado");
		lista.put("A", "Em Local Autorizado");
		lista.put("T", "Em Trânsito");
		lista.put("B", "Bloqueado");
		lista.put("M", "Em Manobra");
		lista.put("R", "Rastreado");
		lista.put("S", "Em Modo	de Economia	de Energia");
		lista.put("I", "Em Modo Instalação");
		lista.put("F", "Em Modo Fábrica");
		lista.put("C", "Cancelado");
		lista.put("O", "veículo	está em	Modo Macro");
	}

	public String devolveDescricao(String chave) {
		
		return lista.get(chave);
	}	
}
