package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String nome1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida1 = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura1 = sc.nextInt();

		System.out.println();

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida2 = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura2 = sc.nextInt();

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int turnos = sc.nextInt();

		System.out.println();

		for (int i = 0; i < turnos; i++) {
			System.out.println("Resultado do turno " + (i + 1) + ":");
			int combate1 = (vida1 + armadura1) - ataque2;
			if (combate1 < 0) {
				combate1 = 0;
			}
			if (armadura1 > ataque2) {
				vida1 -= 1;
				combate1 = vida1;
			}
			vida1 = combate1;
			int combate2 = (vida2 + armadura2) - ataque1;
			if (combate2 < 0) {
				combate2 = 0;
			}
			if (armadura2 > ataque1) {
				vida2 -= 1;
				combate2 = vida2;
			}
			vida2 = combate2;
			/*
			 * if (vida1 = 0) { i = (turnos - 1); } if (vida2 = 0) { i = (turnos - 1); }
			 */
			System.out.println(nome1 + ": " + vida1 + " de vida");
			System.out.println(nome2 + ": " + vida2 + " de vida");
		}

		System.out.print("FIM DO COMBATE");

		sc.close();

	}

}
