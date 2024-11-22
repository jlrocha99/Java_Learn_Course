import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int code, amount;
    double total = 0;
    Scanner input = new Scanner(System.in);

    code = input.nextInt();
    amount = input.nextInt();

    if(code == 1){
      total = 4 * amount;
    }
    else if(code == 2) {
      total = 4.5 * amount;
    }
    else if(code == 3) {
      total = 5 * amount;
    }
    else if(code == 4) {
      total = 2 * amount;
    }
    else if(code == 5) {
      total = 1.5 * amount;
    }

    System.out.printf("Total: R$ %.2f\n", total);
  }
}
