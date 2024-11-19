import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    int a, b, sum = 0;
    Scanner input = new Scanner(System.in);

    a = input.nextInt();
    b = input.nextInt();

    sum = a + b;
    System.out.printf("SOMA = %d", sum);
  }
}
