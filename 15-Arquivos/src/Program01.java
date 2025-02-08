import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program01 {
  public static void main(String[] args) {
    //lendo arquivo texto com Classes File e Scanner
    File file = new File("c:\\in.txt");
    Scanner input = null;
    try {
      input = new Scanner(file);
      while (input.hasNextLine()) {
        System.out.println(input.nextLine());
      }
    }
    catch (IOException ie) {
      System.out.println("Error: " + ie.getMessage());
    }
    finally {
      if(input != null) {
        input.close();
      }
    }

  }
}
