import java.util.Locale;
import java.util.Scanner;

public class CalcArea {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double triangleXL1, triangleXL2, triangleXL3, perimeterX, areaX;
    double triangleYL1, triangleYL2, triangleYL3, perimeterY, areaY;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the measure of the triangle X:");
    triangleXL1 = input.nextDouble();
    triangleXL2 = input.nextDouble();
    triangleXL3 = input.nextDouble();

    System.out.println("Enter the measure of the triangle Y:");
    triangleYL1 = input.nextDouble();
    triangleYL2 = input.nextDouble();
    triangleYL3 = input.nextDouble();

    perimeterX = (triangleXL1 + triangleXL2 + triangleXL3) / 2;
    perimeterY = (triangleYL1 + triangleYL2 + triangleYL3) / 2;

    areaX = Math.sqrt(perimeterX * (perimeterX - triangleXL1) * (perimeterX - triangleXL2) * (perimeterX - triangleXL3));
    areaY = Math.sqrt(perimeterY * (perimeterY - triangleYL1) * (perimeterY - triangleYL2) * (perimeterY - triangleYL3));

    System.out.printf("Triangle X area: %.4f\n", areaX);
    System.out.printf("Triangle Y area: %.4f\n", areaY);

    if(areaX > areaY) {
      System.out.println("Larger Area: X");
    }
    else {
      System.out.println("Larger Area: Y");
    }
  }
}
