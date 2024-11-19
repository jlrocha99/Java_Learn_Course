import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double salary, taxes = 0, aux = 0;
    Scanner input = new Scanner(System.in);
    salary = input.nextDouble();

    if (salary >= 0 && salary <= 2000) {
      System.out.println("Isento");
    }
    else if (salary > 2000 && salary <= 3000) {
      salary -= 2000;
      taxes = salary * 0.08;
      System.out.printf("R$ %.2f", taxes);
    }
    else if (salary > 3000 && salary <= 4500) {
      //3002.00
      salary -= 2000;
      //1002.00
      aux = salary - 1000;
      taxes = (salary - aux) * 0.08;
      taxes += aux * 0.18;
      System.out.printf("R$ %.2f", taxes);
    }
    else if(salary > 4500) {
      salary -= 2000;
      
    }

  }
}