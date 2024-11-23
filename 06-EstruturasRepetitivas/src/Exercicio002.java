import java.util.Scanner;

public class Exercicio002 {
  public static void main (String[] args) {
    int numberTimes, number, in = 0, out = 0;
    Scanner input = new Scanner(System.in);
    numberTimes = input.nextInt();

    for(int i = 0; i < numberTimes; i++) {
      number = input.nextInt();
      if(number >= 10 && number <= 20) {
        in++;
      }
      else {
        out++;
      }
    }
    System.out.printf("%d in\n", in);
    System.out.printf("%d out\n", out);
  }
}
