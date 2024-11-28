package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Rectangle rectangle = new Rectangle();
    Scanner input = new Scanner(System.in);

    System.out.println("Enter rectangle width and height:");
    rectangle.width = input.nextDouble();
    rectangle.height = input.nextDouble();

    System.out.printf("AREA = %.2f\n", rectangle.area());
    System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
    System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());


  }
}
