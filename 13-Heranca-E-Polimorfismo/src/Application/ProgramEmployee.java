package Application;

import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    List<Employee> employeeList = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Employee #" + i + " data:");
      System.out.print("Outsourced (y/n)? ");
      char resp = input.next().charAt(0);
      System.out.print("Name: ");
      input.nextLine();
      String name = input.nextLine();
      System.out.print("Hour: ");
      int hours = input.nextInt();
      System.out.print("Value per hour: ");
      double valuePerHour = input.nextDouble();
      if (resp == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = input.nextDouble();
        Employee employeeOut = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
        employeeList.add(employeeOut);
      } else {
        Employee employee = new Employee(name, hours, valuePerHour);
        employeeList.add(employee);
      }

    }

    System.out.println();
    System.out.println("PAYMENTS: ");
    for (Employee emp : employeeList) {
      System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
    }

    /*  Another way to print my list items
    for (int i = 0; i < n; i++) {
      System.out.println(employeesList.get(i).getName() +  " - $ " + employeesList.get(i).payment());
    }
     */
  }
}
