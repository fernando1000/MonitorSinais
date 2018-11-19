package br.com.x10d.monitorsinais.model;

import java.util.HashMap;

public class StatusComandoLista {

	HashMap<String, String> lista; 
	
	public String devolveDescricao(String chave) {
		
		return lista.get(chave);
	}	

	public StatusComandoLista() {
		
		lista = new HashMap<String, String>();
		lista.put("W", "comando está aguardando transmissão (quando o Rastreador está conectado)");
		lista.put("T", "comando foi enviado, porém ack ainda não foi recebido do Rastreador");
		lista.put("S", "comando foi enviado para o Rastreador");
		lista.put("F", "significa uma confirmação de leitura de mensagem de texto");
		lista.put("E", "significa erro genérico");
		lista.put("C", "comando foi cancelado");
		lista.put("P", "comando está com cancelamento pendente");
		lista.put("R", "comando segmentado: Aguardando início da transferência");
		lista.put("A", "comando segmentado: Transferência iniciada");
		lista.put("G", "comando segmentado: Transferindo");
		lista.put("N", "comando segmentado: Transferido e aguardando confirmação");
		lista.put("O", "comando segmentado: Erro na transferência");
		lista.put("D", "comando segmentado: Transferido e confirmado com sucesso");
		lista.put("-1", "significa que o Id de Sequência informado não está relacionado a um comando");
		lista.put("-2", "significa que o Id de Sequência informado não foi encontrado");
		lista.put("-3", "significa que o usuário não tem permissão de visualização do comando ou do veículo");
	}
	
}
