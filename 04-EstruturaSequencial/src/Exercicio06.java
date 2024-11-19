import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double a, b ,c;
    double pi = 3.14159;

    Scanner input = new Scanner(System.in);
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    System.out.printf("TRIANGULO: %.3f\n", (a * c / 2) );
    System.out.printf("CIRCULO: %.3f\n", (pi * Math.pow(c, 2)));
    System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
    System.out.printf("QUADRADO: %.3f\n", (Math.pow(b, 2)));
    System.out.printf("RETANGULO: %.3f\n", (a * b));
  }
}
