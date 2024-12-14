import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
  public static void main (String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = input.nextInt();
    double[] numbers = new double[n];
    double sum = 0;
    double average = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um numero: ");
      numbers[i] = input.nextDouble();
      sum+= numbers[i];
    }
    average = sum / numbers.length;

    System.out.println();
    System.out.printf("MEDIA DO VETOR = %.3f\n", average);
    System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] < average) {
        System.out.printf("%.1f\n", numbers[i]);
      }
    }

  }
}
