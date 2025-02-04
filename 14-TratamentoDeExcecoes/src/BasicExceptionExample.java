import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BasicExceptionExample {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    //bloco de codigo passivel de erro
    try {
      String[] vect = input.nextLine().split(" ");
      int position = input.nextInt();
      System.out.println(vect[position]);
    }
    //Blocos de codigo com erros especificos e o retorno que desejo printar caso ocorram
    catch (ArrayIndexOutOfBoundsException arrayExample) {
      System.out.println("Invalid Position!");
    }
    catch (InputMismatchException InputExample) {
      System.out.println("Input error!");
    }

    System.out.println("End of program!");
  }
}
