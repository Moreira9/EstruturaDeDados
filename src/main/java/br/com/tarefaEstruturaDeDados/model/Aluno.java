package br.com.tarefaEstruturaDeDados.model;

public class Aluno implements INomeavel {
	
	private String nome;
	private Integer distancia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getDistancia() {
		return distancia;
	}
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	@Override
	public String toString() {
	
		return "Nome: " + nome + " Distancia: " + distancia + "Km";
	}
	
	

}
