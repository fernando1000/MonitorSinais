package br.com.x10d.monitorsinais.model;

public class Mnemonico {

	private String descricao;
	private String tipo;
	private String criticidade;
	private String chave;
	
	public Mnemonico(String descricao, String tipo, String criticidade, String chave) {
		this.descricao = descricao;
		this.tipo = tipo;
		this.criticidade = criticidade;
		this.chave = chave;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCriticidade() {
		return criticidade;
	}

	public String getChave() {
		return chave;
	}
	
	
	
	
}
