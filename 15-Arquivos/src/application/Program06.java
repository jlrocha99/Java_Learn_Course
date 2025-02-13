package application;

import java.io.File;
import java.util.Scanner;

public class Program06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a file path: ");
    String strpath = input.nextLine();

    File path = new File(strpath);

    //Retornar o nome do arquivo, caminho ate ele ou o caminho inteiro
    System.out.println("getName: " + path.getName());
    System.out.println("getParent: " + path.getParent());
    System.out.println("getPath: " + path.getPath());

  }
}
