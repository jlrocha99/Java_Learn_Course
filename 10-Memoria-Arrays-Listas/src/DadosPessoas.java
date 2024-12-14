import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = input.nextInt();
    double[] height = new double[n];
    char[] gender = new char[n];

    double lowerHeight;
    double highHeight;
    double sumHeightWoman;
    int numberMen;
    int numberWomen;


    for(int i = 0; i < height.length; i++) {
      System.out.printf("Altura da %da pessoa: ", i + 1);
      height[i] = input.nextDouble();
      System.out.printf("Genero da %da pessoa: ", i + 1);
      gender[i] = input.next().charAt(0);
    }

    lowerHeight = height[0];
    highHeight = height[0];

    for (int i = 0; i < height.length; i++) {
      if (highHeight < height[i]) {
        highHeight = height[i];
      }
      if (lowerHeight > height[i]) {
        lowerHeight = height[i];
      }
    }

    sumHeightWoman = 0;
    numberMen = 0;
    numberWomen = 0;

    for (int i = 0; i < height.length; i++) {
      if(gender[i] == 'F') {
        sumHeightWoman += height[i];
        numberWomen++;
      }
      else if(gender[i] == 'M') {
        numberMen++;
      }
    }

    System.out.println();
    System.out.printf("Menor Altura = %.2f\n", lowerHeight);
    System.out.printf("Maior Altura = %.2f\n", highHeight);
    System.out.printf("Numero das alturas da mulheres = %.2f\n", sumHeightWoman / numberWomen);
    System.out.printf("Numero de homens = %d", numberMen);
  }
}
