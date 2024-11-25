import java.util.Scanner;

public class Funcoes {
  public static void main(String[] args) {
    int a, b, c;
    int high;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    high = max(a, b, c);
    showResult(high);

  }

  public static int max(int x, int y, int z) {
    int aux;

    if(x > y && x > z) {
      aux = x;
    }
    else if(y > z) {
      aux = y;
    }
    else {
      aux = z;
    }
    return aux;
  }
  public static void showResult(int value) {
    System.out.printf("Higher = %d\n", value);
  }


}
