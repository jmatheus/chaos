package br.chaos.model.entities;

public class Character {

	private String nome;
	private Raca raca;
	private Classe classe;
	private int nivel;
	private Habilidades hab;
	private ClasseArmadura ca;
	
	//Getis e Setiiis
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
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
