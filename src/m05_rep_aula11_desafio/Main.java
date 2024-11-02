package m05_rep_aula11_desafio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, quantHomens = 0, quantMulheres = 0;
		String nome, atletaMaisAlto = "";
		char sexo;
		double altura, alturaMaior = 0, peso, pesoSoma = 0, pesoMedio, porcHomens, somaAlturaMulheres = 0, alturaMediaMulheres;
		
		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do atleta número " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Valor inválido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			
			if (sexo == 'M')
				quantHomens++;
			else
				quantMulheres++;
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			
			if (altura > alturaMaior) {
				alturaMaior = altura;
				atletaMaisAlto = nome;
			}
			
			if (sexo == 'F')
				somaAlturaMulheres += altura;
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			pesoSoma += peso;
		}
		
		pesoMedio = pesoSoma / n;
		porcHomens = ((double) quantHomens / n) * 100;
		alturaMediaMulheres = somaAlturaMulheres / quantMulheres;
		
		System.out.println("\nRELATÓRIO:");
		System.out.printf("Peso médio dos atletas %.2f%n", pesoMedio);
		System.out.printf("Atleta mais alto: %s%n", atletaMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f%%%n", porcHomens);
		if (quantMulheres == 0)
			System.out.println("Não há mulheres cadastradas");
		else
			System.out.printf("Altura média das mulheres: %.2f", alturaMediaMulheres);
		
		sc.close();
	}
}