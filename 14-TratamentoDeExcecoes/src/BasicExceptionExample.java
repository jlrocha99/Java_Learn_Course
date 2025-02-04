import java.util.InputMismatchException;

import java.util.Scanner;

public class BasicExceptionExample {
  public static void main(String[] args) {

    method1();
    System.out.println("End of program!");
  }

  public static void method1() {
    System.out.println("*** Method1 START ***");
    method2();
    System.out.println("*** Method1 END ***");
  }

  public static void method2() {
    System.out.println("*** Method2 START ***");
    Scanner input = new Scanner(System.in);
    try {
      String[] vect = input.nextLine().split(" ");
      int position = input.nextInt();
      System.out.println(vect[position]);
    }
    catch (ArrayIndexOutOfBoundsException arrayExample) {
      System.out.println("Invalid Position!");
      //
      arrayExample.printStackTrace();
      input.next();
    }
    catch (InputMismatchException InputExample) {
      System.out.println("Input error!");
    }
    System.out.println("*** Method2 END ***");
  }
}
