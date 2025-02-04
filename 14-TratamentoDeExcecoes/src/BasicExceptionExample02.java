import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicExceptionExample02 {
  public static void main(String[] args) {
    File file = new File("C:\\in.txt");
    Scanner input = null;

    try {
      input = new Scanner(file);
      while (input.hasNextLine()) {
        System.out.println(input.nextLine());
      }
    }
    catch (IOException e) {
      System.out.println("Error Opening file: " + e.getMessage());
    }
    //bloco finally sera executado independente se houver excessoes ou nao
    finally {
      if (input != null) {
        input.close();
      }
      System.out.println("Finally block executed!");
    }
  }

}
