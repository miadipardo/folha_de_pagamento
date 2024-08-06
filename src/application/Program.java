package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// =======lendo nome, salario e imposto
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		//adicionando porcentagem  ao salario
		System.out.print("Wich percentage to increase salary? ");
		double porcent = sc.nextDouble();
		employee.increaseSalary(porcent);

		System.out.print("Updated data: " + employee);

		sc.close();
	}

}
