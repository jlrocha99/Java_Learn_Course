import java.util.Scanner;

public class Factorial_Optimized {
  public static void main(String[] args) {
    int factorial = 1, n;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();

    for(int i = n; i > 0; i--) {
      factorial = factorial * i;
    }
    System.out.printf("%d\n", factorial);
  }
}
