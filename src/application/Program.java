package application;

import java.util.Locale;
import java.util.Scanner;

import util.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		
		Champion champion1 = new Champion(nome, vida, ataque, armadura);

		System.out.println();

		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		vida = sc.nextInt();
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		System.out.print("Armadura: ");
		armadura = sc.nextInt();
		
		Champion champion2 = new Champion(nome, vida, ataque, armadura);

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int turnos = sc.nextInt();

		System.out.println();

		for (int i = 0; i < turnos; i++) {
			System.out.println("Resultado do turno " + (i + 1) + ":");

			int combate1 = (champion1.vida + champion1.armadura) - champion2.ataque;
			if (combate1 < 0) {
				combate1 = 0;
			}
			if (champion1.armadura > champion2.ataque) {
				champion1.vida -= 1;
				combate1 = champion1.vida;
			}
			champion1.vida = combate1;
			int combate2 = (champion2.vida + champion2.armadura) - champion1.ataque;
			if (combate2 < 0) {
				combate2 = 0;
			}
			if (champion2.armadura > champion1.ataque) {
				champion2.vida -= 1;
				combate2 = champion2.vida;
			}
			champion2.vida = combate2;
			if (champion1.vida == 0) {
				turnos = i;
				System.out.println(champion1.nome + ": " + champion1.vida + " de vida (morreu)");
				System.out.println(champion2.nome + ": " + champion2.vida + " de vida");
				System.out.println();
			} else if (champion2.vida == 0) {
				turnos = i;
				System.out.println(champion1.nome + ": " + champion1.vida + " de vida");
				System.out.println(champion2.nome + ": " + champion2.vida + " de vida (morreu)");
				System.out.println();
			} else {
				System.out.println(champion1.nome + ": " + champion1.vida + " de vida");
				System.out.println(champion2.nome + ": " + champion2.vida + " de vida");
				System.out.println();
			}
		}
		System.out.print("FIM DO COMBATE");
		sc.close();
	}

}
