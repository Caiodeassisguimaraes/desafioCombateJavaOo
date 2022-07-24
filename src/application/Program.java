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

			int combate1 = (champion1.getVida() + champion1.getArmadura()) - champion2.getAtaque();
			if (combate1 < 0) {
				combate1 = 0;
			}
			if (champion1.getArmadura() > champion2.getAtaque()) {
				champion1.setVida(champion1.getVida() - 1);
				combate1 = champion1.getVida();
			}
			champion1.setVida(combate1);
			
			int combate2 = (champion2.getVida() + champion2.getArmadura()) - champion1.getAtaque();
			if (combate2 < 0) {
				combate2 = 0;
			}
			if (champion2.getArmadura() > champion1.getAtaque()) {
				champion2.setVida(champion2.getVida() - 1);
				combate2 = champion2.getVida();
			}
			champion2.setVida(combate2);
			if (champion1.getVida() == 0) {
				turnos = i;
				System.out.println(champion1.status());
				System.out.println(champion2.getNome() + ": " + champion2.getVida() + " de vida");
				System.out.println();
			} else if (champion2.getVida() == 0) {
				turnos = i;
				System.out.println(champion1.getNome() + ": " + champion1.getVida() + " de vida");
				System.out.println(champion2.status());
				System.out.println();
			} else {
				System.out.println(champion1.getNome() + ": " + champion1.getVida() + " de vida");
				System.out.println(champion2.getNome() + ": " + champion2.getVida() + " de vida");
				System.out.println();
			}
		}
		System.out.print("FIM DO COMBATE");
		sc.close();
	}

}
