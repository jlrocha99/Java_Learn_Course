package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program05 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Student student = new Student();
    Scanner input = new Scanner(System.in);

    student.name = input.nextLine();
    student.grade1 = input.nextDouble();
    student.grade2 = input.nextDouble();
    student.grade3 = input.nextDouble();

    System.out.printf("FINAL GRADE = %.2f\n", student.average());

    if(student.average() < 60) {
      System.out.println("FAILED");
      System.out.printf("MISSING %.2f POINTS\n", student.missingPoints());
    }
    else {
      System.out.println("PASS");
    }
  }
}
