import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("Quantas vezes voce vai digitar? ");
    int n = input.nextInt();
    double vect[] = new double[n];
    double sum = 0;

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = input.nextDouble();
      sum += vect[i];
    }

    System.out.print("VALORES = ");
    for (int i = 0; i < vect.length; i++) {
      System.out.printf(" %.1f ", vect[i]);

    }
    System.out.println();
    System.out.printf("SOMA = %.2f\n", sum);
    System.out.printf("MEDIA = %.2f\n", sum / vect.length);

  }
}
