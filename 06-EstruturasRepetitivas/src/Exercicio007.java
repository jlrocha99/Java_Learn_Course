import java.util.Scanner;

public class Exercicio007 {
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);
    number = input.nextInt();

    for(int i = 1; i <= number; i++) {
      System.out.printf("%d", i);
      System.out.printf(" %d", i*i);
      System.out.printf(" %d\n", i*i*i);
    }
  }
}
