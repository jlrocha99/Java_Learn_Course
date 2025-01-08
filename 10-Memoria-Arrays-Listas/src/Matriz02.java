import java.util.Scanner;

public class Matriz02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();

    int[][] matriz = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matriz[i][j] = input.nextInt();
      }
    }
    System.out.println();

    int position = input.nextInt();
    System.out.println();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matriz[i][j] == position) {
          System.out.printf("Position %d,%d:\n", i, j);
          //Up
          if (i > 0) {
            System.out.printf("UP: %d\n", matriz[i - 1][j]);
          }
          //Down
          if (i != n-1) {
            System.out.printf("Down: %d\n", matriz[i + 1][j]);
          }
          //Left
          if (j > 0) {
            System.out.printf("Left: %d\n", matriz[i][j-1]);
          }
          //Right
          if (j != m-1) {
            System.out.printf("Right: %d\n", matriz[i][j+1]);

          }
        }
      }
    }
  }
}
