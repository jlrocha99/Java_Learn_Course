import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int x;
    double grade1, grade2, grade3, averages = 0;
    Scanner input = new Scanner(System.in);
    x = input.nextInt();

    for(int i = 0; i < x; i ++) {
      grade1 = input.nextDouble();
      grade2 = input.nextDouble();
      grade3 = input.nextDouble();
      averages = ((grade1 * 2) + (grade2 * 3) + (grade3 * 5)) / 10;
      System.out.printf("%.1f\n", averages);
    }
  }
}
