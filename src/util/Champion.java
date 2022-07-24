package util;

public class Champion {
	//atributos	da Classe
	private String nome;
	private int vida;
	private int ataque;
	private int armadura;
	
	//Construtor
	
	public Champion(String nome, int vida, int ataque, int armadura) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.armadura = armadura;
	}

	//Metodos Get e Set
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	//Metodos
	
	public void takeDamage () {
		
	}
	
	public String status () {
		return nome + ": " + vida + " de vida (morreu)";
	}
	
}