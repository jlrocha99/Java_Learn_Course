import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double pi = 3.14159;
    double raio, area = 0;
    Scanner input = new Scanner(System.in);

    raio = input.nextDouble();

    area = pi * Math.pow(raio, 2);

    System.out.printf("A=%.4f", area);

  }
}
