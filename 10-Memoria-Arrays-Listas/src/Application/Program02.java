package Application;

import Entities.Products02;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    Products02[] vect = new Products02[n];
    double sum = 0;
    for(int i = 0; i < vect.length; i++) {
      input.nextLine();
      String name = input.nextLine();
      double price = input.nextDouble();
      vect[i] = new Products02(name, price);
      sum += vect[i].getPrice();
    }

    double average = sum / vect.length;

    System.out.printf("AVERAGE PRICE = %.2f\n", average);

  }
}
