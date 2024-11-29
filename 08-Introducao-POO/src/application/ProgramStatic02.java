package application;

import util.Calculator02;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStatic02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Calculator02 calc = new Calculator02();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double radius = input.nextDouble();

    double c = calc.circumference(radius);
    double v = calc.volume(radius);

    System.out.printf("Circumference: %.2f\n", c);
    System.out.printf("Volume: %.2f\n", v);
    System.out.printf("PI value: %.2f\n", calc.PI);
  }
}
