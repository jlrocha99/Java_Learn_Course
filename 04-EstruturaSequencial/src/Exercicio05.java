import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int codePiece1, codePiece2;
    int numberPiece1, numberPiece2;
    double valuePiece1, valuePiece2, totalValue = 0;

    Scanner input = new Scanner(System.in);

    codePiece1 = input.nextInt();
    numberPiece1 = input.nextInt();
    valuePiece1 = input.nextDouble();

    codePiece2 = input.nextInt();
    numberPiece2 = input.nextInt();
    valuePiece2 = input.nextDouble();

    totalValue = (valuePiece1 * numberPiece1) + (valuePiece2 * numberPiece2);

    System.out.printf("VALOR A PAGAR: R$ %.2f", totalValue);

  }
}
