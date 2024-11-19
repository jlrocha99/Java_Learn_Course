import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    int number;

    Scanner input = new Scanner(System.in);
    number = input.nextInt();

    if(number % 2 == 0){
      System.out.println("PAR");
    }
    else {
      System.out.println("IMPAR");
    }
  }
}
