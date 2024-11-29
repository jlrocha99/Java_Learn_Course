package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program06 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double dollar = input.nextDouble();
    System.out.print("How many dollars will be bought? ");
    double real = input.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(real, dollar));
  }
}
