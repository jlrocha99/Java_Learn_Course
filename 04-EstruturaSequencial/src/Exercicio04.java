import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int numEmployee, hoursWork;
    double valueHour, salary = 0;

    Scanner input = new Scanner(System.in);
    numEmployee = input.nextInt();
    hoursWork = input.nextInt();
    valueHour = input.nextDouble();

    salary =  hoursWork * valueHour;

    System.out.printf("NUMBER = %d\n", numEmployee);
    System.out.printf("SALARY = U$ %.2f", salary);


  }
}
