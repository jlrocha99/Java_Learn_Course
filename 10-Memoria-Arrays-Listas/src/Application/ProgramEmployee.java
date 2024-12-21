package Application;

import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
  public static void main (String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("How many employees will be registered? ");
    int n = input.nextInt();
    List<Employee> list = new ArrayList<>();



    for(int i = 0; i < n; i++) {
      System.out.println();
      System.out.printf("Employee #%d:\n", i+1);
      System.out.print("Id: ");
      Integer id = input.nextInt();
      input.nextLine();
      System.out.print("name: ");
      String name = input.nextLine();
      System.out.print("Salary: ");
      Double salary = input.nextDouble();

      Employee employer = new Employee(id, name, salary);
      list.add(employer);
    }

    System.out.print("Enter the employee id that have salary increase :");
    for (int i = 0; i < list.size(); i++) {
      Integer id = input.nextInt();
      if(list.contains(id))
    }


    System.out.println();
    System.out.println("List of Employees: ");
    for(int i = 0; i < n; i++) {
      System.out.println(list.get(i));

    }







  }
}

