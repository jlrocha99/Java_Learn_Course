import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {
  public static void main(String[] args) {
    //FileReader e BufferedReader
    //Feitos de uma forma mais verbosa e menos usual (forma ruim de fazer)
    String path = "c:\\in.txt";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);

      String line = br.readLine();

      while(line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    }
    catch (IOException ie) {
      System.out.println("Error: " + ie.getMessage());
    }
    finally {
      try{
        if(br != null) {
          br.close();
        }
        if(fr != null) {
          fr.close();
        }
      }
      catch (IOException ie) {
        ie.printStackTrace();
      }
    }
  }
}
