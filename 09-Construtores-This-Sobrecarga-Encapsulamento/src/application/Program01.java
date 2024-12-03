package application;

import entities.Product01;
import java.util.Locale;
import java.util.Scanner;

public class Program01 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.println("Enter product data:");

    System.out.print("Name: ");
    String name = input.nextLine();

    System.out.print("Price: ");
    double price = input.nextDouble();

    Product01 product = new Product01(name, price); //Objeto instanciado já com os valores iniciais do usuário
    System.out.println(product);

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
