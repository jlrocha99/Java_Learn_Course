import java.util.Scanner;

public class Matriz01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int [][] matriz = new int[n][n];
    int negativeNum = 0;

    //Preencher matriz
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = input.nextInt();
        if (matriz[i][j] < 0) {
          negativeNum++;
        }
      }
    }

    //Printar matriz
    System.out.println();
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.printf("%d  ", matriz[i][j]);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Main Diagonal: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if(i == j) {
          System.out.printf("%d ", matriz[i][j]);
        }
      }
    }
    System.out.println();
    System.out.printf("Negative Numbers = %d", negativeNum);



  }
}
