import java.util.Locale;
import java.util.Scanner;

public class Alturas {
  public static void main (String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    double sum = 0;
    double under16age = 0;

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = input.nextInt();

    String[] name = new String[n];
    int[] age = new int[n];
    double[] height = new double[n];

    String[] under16Names = new String[n];

    for (int i = 0; i < name.length; i++) {
      input.nextLine();
      System.out.printf("Dados da %da pessoa:\n", i + 1);
      System.out.print("Nome: ");
      name[i] = input.nextLine();
      System.out.print("Idade: ");
      age[i] = input.nextInt();
      System.out.print("Altura: ");
      height[i] = input.nextDouble();

      sum += height[i];

      if(age[i] < 16) {
        under16age++;
        under16Names[i] = name[i];
      }
    }

    System.out.println();
    System.out.printf("Altura media: %.2f\n", sum/ name.length);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (under16age / age.length) * 100);

    for (int i = 0; i < name.length; i++) {
      if (under16Names[i] != null) {
        System.out.println(under16Names[i]);
      }
    }
  }
}
