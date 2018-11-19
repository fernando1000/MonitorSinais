package br.com.x10d.monitorsinais.model;

import java.util.HashMap;

public class StatusComandoLista {

	HashMap<String, String> lista; 
	
	public String devolveDescricao(String chave) {
		
		return lista.get(chave);
	}	

	public StatusComandoLista() {
		
		lista = new HashMap<String, String>();
		lista.put("W", "comando est� aguardando transmiss�o (quando o Rastreador est� conectado)");
		lista.put("T", "comando foi enviado, por�m ack ainda n�o foi recebido do Rastreador");
		lista.put("S", "comando foi enviado para o Rastreador");
		lista.put("F", "significa uma confirma��o de leitura de mensagem de texto");
		lista.put("E", "significa erro gen�rico");
		lista.put("C", "comando foi cancelado");
		lista.put("P", "comando est� com cancelamento pendente");
		lista.put("R", "comando segmentado: Aguardando in�cio da transfer�ncia");
		lista.put("A", "comando segmentado: Transfer�ncia iniciada");
		lista.put("G", "comando segmentado: Transferindo");
		lista.put("N", "comando segmentado: Transferido e aguardando confirma��o");
		lista.put("O", "comando segmentado: Erro na transfer�ncia");
		lista.put("D", "comando segmentado: Transferido e confirmado com sucesso");
		lista.put("-1", "significa que o Id de Sequ�ncia informado n�o est� relacionado a um comando");
		lista.put("-2", "significa que o Id de Sequ�ncia informado n�o foi encontrado");
		lista.put("-3", "significa que o usu�rio n�o tem permiss�o de visualiza��o do comando ou do ve�culo");
	}
	
}
