package m08_aula11_poo_desafio.application;

import java.util.Scanner;

import m08_aula11_poo_desafio.entities.Champion;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		Champion championA = new Champion(name, life, attack, armor);
		
		System.out.println("\nDigite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		Champion championB = new Champion(name, life, attack, armor);
		
		System.out.print("\nQuantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nResultado do turno " + (i + 1) + ":");
			championA.takeDamage(championB);
			championB.takeDamage(championA);
			System.out.println(championA.status());
			System.out.println(championB.status());
			
			if (championA.getLife() == 0 || championB.getLife() == 0)
				break;
		}
		
		System.out.println("\nFIM DO COMBATE");
		
		sc.close();
	}
}