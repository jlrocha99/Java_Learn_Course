import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    int number;

    Scanner input = new Scanner(System.in);
    number = input.nextInt();

    if(number >= 0) {
      System.out.println("NAO NEGATIVO");
    }
    else {
      System.out.println("NEGATIVO");
    }
  }
}
