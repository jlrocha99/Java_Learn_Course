package application;

import entities.Client_Ex3;
import entities.OrderItem_Ex3;
import entities.Order_Ex3;
import entities.Product_Ex3;
import entities.enums.OrderStatus_Ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder_Ex3 {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Enter client data: ");
    System.out.print("Name: ");
    String name = input.nextLine();
    System.out.print("Email: ");
    String email = input.nextLine();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(input.next());

    //Instantiating an object
    Client_Ex3 client = new Client_Ex3(name, email, birthDate);

    System.out.println("Enter Order Data: ");
    System.out.print("Status: ");
    OrderStatus_Ex3 status = OrderStatus_Ex3.valueOf(input.next());

    Order_Ex3 order = new Order_Ex3(new Date(), status, client);

    System.out.print("How many items to this order? ");
    int numberOrder = input.nextInt();

    for (int i = 1; i <= numberOrder; i++) {
      System.out.println("Enter #" + i + " item data: ");
      System.out.print("Product name: ");
      input.nextLine();
      String productName = input.nextLine();
      System.out.print("Product price: ");
      double productPrice = input.nextDouble();

      Product_Ex3 product = new Product_Ex3(productName, productPrice);

      System.out.print("Quantity: ");
      int quantity = input.nextInt();

      OrderItem_Ex3 orderItem = new OrderItem_Ex3(quantity, productPrice, product);

      order.addItem(orderItem);

    }


    System.out.println();
    System.out.println("ORDER SUMMARY: ");
    System.out.println(order);

  }
}
