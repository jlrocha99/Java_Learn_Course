package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program04 {
  public static void main(String[] args) {

    String[] lines = new String[] {"Good Morning", "Good Night"};
    String path = "C:\\in.txt";

    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

      for (String line: lines) {
        bw.write(line);
        bw.newLine();
      }
    }
    catch (IOException ie) {
      ie.printStackTrace();
    }
  }
}
