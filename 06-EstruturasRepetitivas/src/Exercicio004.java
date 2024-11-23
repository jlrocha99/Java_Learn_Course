import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int x;
    double n1, n2, division = 0;
    Scanner input = new Scanner(System.in);
    x = input.nextInt();

    for(int i = 0; i < x; i++) {
      n1 = input.nextDouble();
      n2 = input.nextDouble();
      if(n2 != 0) {
        division = n1 / n2;
        System.out.printf("%.1f\n", division);
      }
      else {
        System.out.println("divisao impossivel");
      }
    }
  }
}
