package application;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter departament's name: ");
    String departmentName = input.nextLine();

    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String workerName = input.nextLine();
    System.out.print("Level: ");
    String workerLevel = input.nextLine();
    System.out.print("Base salary: ");
    Double baseSalary = input.nextDouble();

    Department department = new Department(departmentName);

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, department);

    System.out.print("How many contracts to this worker? ");
    int numberContracts = input.nextInt();

    for (int i = 1; i <= numberContracts; i++) {
      System.out.println("Enter contract #" + i + "data: ");
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = sdf.parse(input.next());

    }




  }
}
