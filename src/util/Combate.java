package util;

public class Combate {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	//Construtor

	public Combate(String name, int life,  int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	//Métodos de acesso Get e Set
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	//Metodos
	
	public void champion (String name, int life,  int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public static void takeDamage () {
		//life = (life - attack) + armor; 
	}
	
	public String status () {
		return "0";
		
	}
	
}
