package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program04 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Employee employee = new Employee();
    Scanner input = new Scanner(System.in);

    System.out.print("Name: ");
    employee.name = input.nextLine();
    System.out.print("Gross salary: ");
    employee.grossSalary = input.nextDouble();
    System.out.print("Tax: ");
    employee.tax = input.nextDouble();

    System.out.println("Employee: " + employee);
    System.out.print("Which percentage to increase salary? ");
    double percentage = input.nextDouble();
    employee.increaseSalary(percentage);

    System.out.println("Update data: " + employee);
  }
}
