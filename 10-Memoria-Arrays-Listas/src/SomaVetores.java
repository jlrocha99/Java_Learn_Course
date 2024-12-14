import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Quantos valores vai ter cada vetor? ");
    int n = input.nextInt();
    int[] vectorA = new int[n];
    int[] vectorB = new int[n];
    int[] sumVector = new int[n];

    System.out.println("Digite os valores de A: ");
    for (int i = 0; i < vectorA.length; i++) {
      vectorA[i] = input.nextInt();
    }

    System.out.println("Digite os valores de B: ");
    for (int i = 0; i < vectorB.length; i++) {
      vectorB[i] = input.nextInt();
    }

    System.out.println("VETOR RESULTANTE: ");
    for (int i = 0; i < vectorA.length; i++) {
      sumVector[i] = vectorA[i] + vectorB[i];
      System.out.printf("%d\n", sumVector[i]);
    }
  }
}
