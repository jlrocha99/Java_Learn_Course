import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double salary, taxes = 0, aux = 0;
    Scanner input = new Scanner(System.in);
    salary = input.nextDouble();
    aux = salary;

    if (salary >= 0 && salary <= 2000) {
      System.out.println("Isento");
    }
    else if (salary > 2000 && salary <= 3000) {
      aux -= 2000;
      taxes = aux * 0.08;
      System.out.printf("R$ %.2f\n", taxes);
    }
    else if (salary > 3000 && salary <= 4500) {
      aux -= 2000;
      taxes = 1000 * 0.08;
      aux -= 1000;
      taxes += (aux * 0.18);
      System.out.printf("R$ %.2f\n", taxes);
    }
    else if(salary > 4500) {
      aux -= 2000;
      taxes += 1000 * 0.08;
      aux -= 1000;
      taxes += 1500 * 0.18;
      aux -= 1500;
      taxes += aux * 0.28;
      System.out.printf("R$ %.2f\n", taxes);
    }
  }
}