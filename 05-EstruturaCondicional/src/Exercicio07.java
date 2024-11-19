import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double xAxis, yAxis;
    Scanner input = new Scanner(System.in);

    xAxis = input.nextDouble();
    yAxis = input.nextDouble();

    if(xAxis == 0 && yAxis == 0) {
      System.out.println("Origem");
    }
    else if((xAxis > 0 || xAxis < 0) && (yAxis == 0)) {
      System.out.println("Eixo X");
    }
    else if((yAxis > 0 || yAxis < 0) && (xAxis == 0)) {
      System.out.println("Eixo Y");
    }
    else if(xAxis > 0 && yAxis > 0) {
      System.out.println("Q1");
    }
    else if(xAxis < 0 && yAxis > 0) {
      System.out.println("Q2");
    }
    else if(xAxis < 0 && yAxis < 0) {
      System.out.println("Q3");
    }
    else if(xAxis > 0 && yAxis < 0) {
      System.out.println("Q4");
    }
  }
}
