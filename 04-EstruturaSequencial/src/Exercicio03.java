import java.util.Scanner;
public class Exercicio03 {
  public static void main(String[] args) {
    int a, b, c, d;
    int res = 0;
    Scanner input = new Scanner(System.in);

    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();
    res = (a * b) - (c * d);

    System.out.printf("DIFERENCA = %d", res);
  }
}
