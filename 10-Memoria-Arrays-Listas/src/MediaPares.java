import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = input.nextInt();
    int[] numbers = new int[n];

    int auxPairs = 0;
    int sumPairs = 0;
    double averagePairs = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um numero: ");
      numbers[i] = input.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] % 2 == 0) {
        sumPairs += numbers[i];
        auxPairs++;
      }
    }

    if(auxPairs == 0) {
      System.out.println("NENHUM NUMERO PAR");
    }

    else {
      averagePairs = (double) sumPairs / auxPairs;
      System.out.printf("MEDIA DOS PARES = %.1f", averagePairs);
    }
  }
}
