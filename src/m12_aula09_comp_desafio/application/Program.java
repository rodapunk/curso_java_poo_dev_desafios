package m12_aula09_comp_desafio.application;

import java.util.Locale;
import java.util.Scanner;

import m12_aula09_comp_desafio.entities.Address;
import m12_aula09_comp_desafio.entities.Department;
import m12_aula09_comp_desafio.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address = new Address(email, phone);
		Department department = new Department(name, payDay, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String empName = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(empName, salary);
			department.addEmployee(employee);
		}
		
		showReport(department);
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println("\nFOLHA DE PAGAMENTO:");
		System.out.println("Departamento " + dept.getName() + " = R$ " + String.format("%.2f", dept.payroll()));
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println("Funcionários:");
		for (Employee employee: dept.getEmployees())
			System.out.println(employee.getName());
		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
	}
}