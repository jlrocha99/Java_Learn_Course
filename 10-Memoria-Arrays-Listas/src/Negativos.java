import java.util.Scanner;

public class Negativos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Quantos numeros voce vai digitar? ");
    int n = input.nextInt();
    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = input.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS: ");
    for(int i = 0; i < vect.length; i++) {
      if(vect[i] < 0) {
        System.out.printf("%d\n", vect[i]);
      }
    }
  }
}
