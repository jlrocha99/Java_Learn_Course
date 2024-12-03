package application;

import entities.Product02;
import java.util.Locale;
import java.util.Scanner;

public class Program02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.println("Enter product data:");

    System.out.print("Name: ");
    String name = input.nextLine();

    System.out.print("Price: ");
    double price = input.nextDouble();

    Product02 product = new Product02(name, price);
    System.out.println(product);

    product.setName("computer");
    System.out.println("Update name: " + product.getName());

    System.out.printf("Product data: %s\n", product);
    System.out.print("Enter the number of products to be add in stock: ");
    int quantity = input.nextInt();
    product.addProducts(quantity);
    System.out.printf("Update data: %s\n", product);

    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = input.nextInt();
    product.removeProducts(quantity);
    System.out.printf("Update data: %s\n", product);

  }
}
