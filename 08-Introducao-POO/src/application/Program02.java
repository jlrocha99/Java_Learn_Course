package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Product product = new Product();
    Scanner input = new Scanner(System.in);

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = input.next();
    System.out.print("Price: ");
    product.price = input.nextDouble();
    System.out.print("Quantity in stock: ");
    product.quantity = input.nextInt();

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    int quantity = input.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.print("Enter the number os products to be removed in stock: ");
    quantity = input.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

  }
}
