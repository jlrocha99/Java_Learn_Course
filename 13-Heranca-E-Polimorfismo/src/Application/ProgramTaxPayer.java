package Application;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxPayer {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    List<TaxPayer> taxPayerList = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Tax payer #" + i + " data: ");
      System.out.print("Individual or Company (i/c)? ");
      char resp = input.next().charAt(0);
      input.nextLine();
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.print("Annual income: ");
      double annualIncome = input.nextDouble();

      if (resp == 'i') {
        System.out.print("Health expenditures: ");
        double healthExpenditures = input.nextDouble();

        TaxPayer individual = new Individual(name, annualIncome, healthExpenditures);
        taxPayerList.add(individual);
      }
      else {
        System.out.print("Number of employees: ");
        int numberOfEmployees = input.nextInt();

        TaxPayer company = new Company(name, annualIncome, numberOfEmployees);
        taxPayerList.add(company);
      }
    }

    double totalTaxes = 0;
    System.out.println();
    System.out.println("TAXES PAID: ");
    for (TaxPayer taxes: taxPayerList) {
      System.out.println(taxes.getName() + String.format(": $ %.2f", taxes.tax()));
      totalTaxes += taxes.tax();
    }

    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
  }
}
