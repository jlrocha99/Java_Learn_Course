package application;

import util.Calculator03;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStatic03 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner (System.in);

    System.out.print("Enter radius: ");
    double radius = input.nextDouble();
    double c = Calculator03.circumference(radius);
    double v = Calculator03.volume(radius);

    System.out.printf("Circumference: %.2f\n", c);
    System.out.printf("Volume: %.2f\n", v);
    System.out.printf("PI value: %.2f\n", Calculator03.PI);



  }
}
