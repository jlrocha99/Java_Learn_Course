import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
  public static void main (String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = input.nextInt();
    double[] numbers = new double[n];
    double aux = 0;
    int position = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um numero: ");
      numbers[i] = input.nextDouble();
      if(numbers[i] > aux){
        aux = numbers[i];
        position = i;
      }
    }
    System.out.println();
    System.out.printf("MAIOR VALOR = %.1f\n", aux);
    System.out.printf("POSICAO DO MAIOR VALOR = %d", position);

  }
}
