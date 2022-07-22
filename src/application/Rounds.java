package application;

import java.util.Locale;
import java.util.Scanner;

import util.Combate;

public class Rounds {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Combate champion1, champion2;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		
		String nameChampion1 = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int lifeChampion1 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attackChampion1 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armorChampion1 = sc.nextInt();
		
		champion1 = new Combate (nameChampion1,lifeChampion1,attackChampion1,armorChampion1);
				
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String nameChampion2 = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int lifeChampion2 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attackChampion2 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armorChampion2 = sc.nextInt();
		
		champion2 = new Combate (nameChampion2,lifeChampion2,attackChampion2,armorChampion2);
	
		//Combate.takeDamage();
		//Combate.takeDamage(lifeChampion2, attackChampion1, armorChampion2);
		
		champion1.setLife(100);
		
		System.out.print("Quantos turnos voce deseja executar? ");
		int rounds = sc.nextInt();
		
		for (int i=0; i<rounds; i++) {
			System.out.println("Resultado do turno "+(i+1)+":");
			System.out.println(champion1.getName() + ": " + champion1.getLife() + " de vida");
			System.out.println(champion2.getName() + ": " + champion2.getLife() + " de vida");
		}
								
		sc.close();
		
	}

}
