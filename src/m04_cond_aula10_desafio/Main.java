package m04_cond_aula10_desafio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaSalario, rendaServico, rendaCapital, gastoMedico, gastoEducacao;
		double impostoSalario, impostoServico, impostoCapital;
		double maxDedutivel, gastosDedutiveis;
		double impostoBruto, abatimento, impostoDevido;
		
		System.out.print("Renda anual com salário: ");
		rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastoMedico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastoEducacao = sc.nextDouble();
		
		if (rendaSalario / 12 < 3000.0)
			impostoSalario = 0.0;
		else if (rendaSalario / 12 < 5000)
			impostoSalario = rendaSalario * 0.1;
		else
			impostoSalario = rendaSalario * 0.2;
		
		impostoServico = (rendaServico > 0) ? rendaServico * 0.15 : 0.0;
		impostoCapital = (rendaCapital > 0) ? rendaCapital * 0.2 : 0.0;
		
		impostoBruto = impostoSalario + impostoServico + impostoCapital;
		maxDedutivel = impostoBruto * 0.3;
		gastosDedutiveis = gastoMedico + gastoEducacao;
		
		abatimento = (maxDedutivel < gastosDedutiveis) ? maxDedutivel : gastosDedutiveis;
		
		impostoDevido = impostoBruto - abatimento;
		
		System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: R$ %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: R$ %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n%n", impostoCapital);
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: R$ %.2f%n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: R$ %.2f%n%n", gastosDedutiveis);
		System.out.println("RESUMO");
		System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
		System.out.printf("Abatimento: R$ %.2f%n", abatimento);
		System.out.printf("Imposto devido: R$ %.2f", impostoDevido);
		
		sc.close();
	}
}