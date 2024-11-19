import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    int a, b;
    Scanner input = new Scanner(System.in);

    a = input.nextInt();
    b = input.nextInt();

    if(a % b == 0 || b % a == 0) {
      System.out.println("Sao Multiplos");
    }
    else {
      System.out.println("Nao Sao Multiplos");
    }
  }
}

