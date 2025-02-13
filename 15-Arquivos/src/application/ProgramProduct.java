package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    List<Product> productList = new ArrayList<>();

    System.out.print("Enter file path: ");
    String sourceFileStr = input.nextLine();

    File sourceFile = new File(sourceFileStr);
    String sourceFolderStr = sourceFile.getParent();

    boolean success = new File(sourceFolderStr + "\\out").mkdir();

    String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

      String itemCsv = br.readLine();
      while(itemCsv != null) {

        String[] fields = itemCsv.split(",");
        String name = fields[0];
        double price = Double.parseDouble(fields[1]);
        int quantity = Integer.parseInt(fields[2]);

        productList.add(new Product(name, price, quantity));

        itemCsv = br.readLine();
      }

      try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

        for (Product item: productList) {
          bw.write(item.getName() + "," + String.format("%.2f", item.total()));
          bw.newLine();
        }
        System.out.println(targetFileStr + " CREATED");
      }
      catch (IOException ie) {
        System.out.println("Error writing file: " + ie.getMessage());
      }
    }
    catch (IOException ie) {
      System.out.println("Error reading file: " + ie.getMessage());
    }

  }
}
