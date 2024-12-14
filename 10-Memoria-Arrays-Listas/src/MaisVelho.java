import java.util.Scanner;

public class MaisVelho {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Quantas pessoas voce vai digitar? ");
    int n = input.nextInt();
    String[] names = new String[n];
    int[] ages = new int[n];
    String older = null;
    int aux = 0;

    for (int i = 0; i < names.length; i++) {
      System.out.printf("Dados da %da pessoa: \n", i+1);
      System.out.print("Nome: ");
      names[i] = input.next();
      System.out.print("Idade: ");
      ages[i] = input.nextInt();

      if(ages[i] > aux) {
        aux = ages[i];
        older = names[i];
      }
    }

    System.out.printf("PESSOA MAIS VELHA: %s\n", older);

  }
}
