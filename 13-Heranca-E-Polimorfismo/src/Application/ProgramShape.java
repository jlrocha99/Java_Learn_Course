package Application;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShape {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    List<Shape> shapeList = new ArrayList<>();

    System.out.print("Enter the number of shapes: ");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Shape #" + i + " data:");
      System.out.print("Rectangle or Circle (r/c)? ");
      char resp = input.next().charAt(0);
      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(input.next());

      if (resp == 'r') {
        System.out.print("Width: ");
        double width = input.nextDouble();
        System.out.print("Height: ");
        double height = input.nextDouble();

        Shape shapeRectangle = new Rectangle(color, width, height);
        shapeList.add(shapeRectangle);
      }
      else {
        System.out.print("Radius: ");
        double radius = input.nextDouble();

        Shape shapeCircle = new Circle(color, radius);
        shapeList.add(shapeCircle);
      }

    }

    System.out.println();
    System.out.println("SHAPE AREAS: ");
    for (Shape shapes : shapeList) {
      System.out.printf(String.format("%.2f\n", shapes.area()));
    }
  }
}
