package application;

import java.io.File;
import java.util.Scanner;

public class Program05 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a folder path: ");
    String strPath = input.nextLine();

    File path = new File(strPath);

    //Access Folders
    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("FOLDERS: ");
    for (File folder : folders) {
      System.out.println(folder);
    }
    //Access Files
    File[] files = path.listFiles(File::isFile);
    System.out.println("FILES: ");
    for (File file : files) {
      System.out.println(file);
    }
    //Create Files
    boolean success = new File(strPath + "\\subdir").mkdir();
    System.out.println("Directory created successfully " + success);

  }

}
