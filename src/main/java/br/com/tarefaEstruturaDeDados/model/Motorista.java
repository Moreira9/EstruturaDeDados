package br.com.tarefaEstruturaDeDados.model;

public class Motorista implements INomeavel {
	
	private String nome;
	private String modelo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {

		return "Nome: " + nome + "\nModelo: " + modelo ;
	}
	@Override
	public Integer getDistancia() {
	
		return null;
	}
	

}
