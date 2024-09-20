package exercicios.funcionarios.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.funcionarios.entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario emp = new Funcionario();

        System.out.println("Nome: ");
        emp.name = sc.nextLine();
        System.out.println("Salário bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + emp);
        System.out.println();
        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double percentagem = sc.nextDouble();
        emp.increaseSalary(percentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + emp);
        sc.close();

    }
}
