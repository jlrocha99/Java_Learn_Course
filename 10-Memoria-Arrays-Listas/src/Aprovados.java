import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    System.out.print("Quantos alunos serao digitados: ");
    int n = input.nextInt();
    String[] names = new String[n];
    double[] grade1 = new double[n];
    double[] grade2 = new double[n];
    String[] approved = new String[n];

    for(int i = 0; i < names.length; i++) {
      System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
      input.nextLine();
      names[i] = input.nextLine();
      grade1[i] = input.nextDouble();
      grade2[i] = input.nextDouble();

      if((grade1[i] + grade2[i]) / 2 >= 6) {
        approved[i] = names[i];
      }
    }

    System.out.println();
    System.out.println("Alunos aprovados");
    for (int i = 0; i < names.length; i++) {
      if(approved[i] != null) {
        System.out.println(approved[i]);
      }
    }
  }
}
