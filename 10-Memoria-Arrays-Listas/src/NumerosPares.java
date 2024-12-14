import java.util.Scanner;

public class NumerosPares {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = input.nextInt();
    int[] numbers = new int[n];
    int pairs = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um numero: ");
      numbers[i] = input.nextInt();
    }

    System.out.println();
    System.out.println("Numeros Pares: ");
    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] % 2 == 0) {
        System.out.printf("%d ", numbers[i]);
        pairs++;
      }
    }

    System.out.println();
    System.out.println();
    System.out.printf("Quantidade de pares = %d\n", pairs);

  }
}
