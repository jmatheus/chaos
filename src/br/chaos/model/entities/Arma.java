package br.chaos.model.entities;

import br.chaos.model.enums.Alcance;
import br.chaos.model.enums.Tamanho;
import br.chaos.model.enums.Tipo;

public class Arma {
	
	private String nome;
	private Alcance alcance;
	private Tamanho tamanho;
	private Tipo tipo;
	private int dano;
	private String qualidadeEspecial;
	
	
	// Getis e Setiiis
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Alcance getAlcance() {
		return alcance;
	}
	public void setAlcance(Alcance alcance) {
		this.alcance = alcance;
	}
	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public String getQualidadeEspecial() {
		return qualidadeEspecial;
	}
	public void setQualidadeEspecial(String qualidadeEspecial) {
		this.qualidadeEspecial = qualidadeEspecial;
	}
	
	

}
