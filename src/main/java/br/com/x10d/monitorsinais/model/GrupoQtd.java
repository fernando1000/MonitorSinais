package br.com.x10d.monitorsinais.model;

import java.util.List;

public class GrupoQtd {

	private String nome;
	private int qtd;
	private List<HistoryEntryCustom> listaComHistoricos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public List<HistoryEntryCustom> getListaComHistoricos() {
		return listaComHistoricos;
	}
	public void setListaComHistoricos(List<HistoryEntryCustom> listaComHistoricos) {
		this.listaComHistoricos = listaComHistoricos;
	}
	
	
}
