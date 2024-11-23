import java.util.Scanner;

public class Exercicio005 {
  public static void main(String[] args) {
    int factorial = 1, n, aux;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    aux = n;
    for(int i = 0; i < n; i++) {
      factorial = factorial *  aux;
      aux--;
    }
    System.out.printf("%d\n", factorial);
  }
}
