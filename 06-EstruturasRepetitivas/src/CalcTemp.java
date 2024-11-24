import java.util.Scanner;

public class CalcTemp {
  public static void main(String[] args) {
    double temperature, fahrenheitTemp;
    char answer;
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("Digite uma Temperatura em Celsius: ");
      temperature = input.nextDouble();
      fahrenheitTemp = ((9 * temperature) / 5) + 32;
      System.out.printf("Temperatura Equivalente em Fahrenheit: %.1f\n", fahrenheitTemp);
      System.out.println("Deseja repetir (s/n)");
      answer = input.next().charAt(0);

    } while (answer != 'n');
  }
}
