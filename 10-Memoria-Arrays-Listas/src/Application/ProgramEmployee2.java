package Application;

import Entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee2 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("How many employees will be registered? ");
    int n = input.nextInt();

    List <Employee2> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.println();
      System.out.printf("Employee #%d: \n", i+1);
      System.out.print("Id: ");
      Integer id = input.nextInt();
      input.nextLine();
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.print("Salary: ");
      Double salary = input.nextDouble();

      Employee2 emp = new Employee2(name, id, salary);

      list.add(emp);
    }

    System.out.println();
    System.out.println("Enter the employee id that will have salary increase : ");
    int idSalary = input.nextInt();
    Integer pos = position(list, idSalary);

    if(pos != null) {
      System.out.print("Enter the percentage: ");
      double percent = input.nextDouble();
      list.get(pos).increaseSalary(percent);
    }
    else {
      System.out.println("This id does not exist!");
    }

    System.out.println();
    System.out.println("List of Employees");

    for (Employee2 emp : list) {
      System.out.println(emp);
    }

  }

  public static Integer position(List<Employee2> list, int id) {
    for (int i = 0; i < list.size(); i++) {
      if(list.get(i).getId() == id) {
        return i;
      }
    }
    return null;
  }


}
