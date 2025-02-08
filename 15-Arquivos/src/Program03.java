import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program03 {
  public static void main(String[] args) {
    //Bloco try-with-resources
    //Bloco try que declara um ou mais recursos, e garante que esses recursos sejam fechado ao final do bloco
    //Forma Correta de fazer

    String path = "c:\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      while(line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    }
    catch (IOException ie) {
      System.out.println("Error: " + ie.getMessage());
    }
  }
}
