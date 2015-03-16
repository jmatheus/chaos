package br.chaos.model.entities;

public class Raca {

	private String nome;
	private String descricao;
	// Resto dos Atributos (Diego)
	private Habilidades hab;
	private ClasseArmadura ca;
	
	// Getis e Setiiis
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Habilidades getHab() {
		return hab;
	}

	public void setHab(Habilidades hab) {
		this.hab = hab;
	}

	public ClasseArmadura getCa() {
		return ca;
	}

	public void setCa(ClasseArmadura ca) {
		this.ca = ca;
	}

	
	
}
