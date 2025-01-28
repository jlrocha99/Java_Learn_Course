package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<Product> productList = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Product #" + i + " data: ");
      System.out.print("Common, used or imported (c/u/i)? ");
      char resp = input.next().charAt(0);
      input.nextLine();
      System.out.print("Name: ");
      String name = input.nextLine();
      System.out.print("Price: ");
      double price = input.nextDouble();

      if (resp == 'c') {
        Product product = new Product(name, price);
        productList.add(product);
      }
      else if (resp == 'u') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date date = sdf.parse(input.next());

        Product usedProduct = new UsedProduct(name, price, date);
        productList.add(usedProduct);
      }
      else {
        System.out.print("Customs fee: ");
        double customsFee = input.nextDouble();

        Product importedProduct = new ImportedProduct(name, price, customsFee);
        productList.add(importedProduct);
      }

    }

    System.out.println();
    System.out.println("PRICE TAGS: ");
    for (Product prod : productList) {
      System.out.println(prod.priceTag());
    }
  }
}
