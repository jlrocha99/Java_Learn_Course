package Application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Progam01 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    int n;
    n = input.nextInt();
    double totalHeight = 0;
    double[] height = new double[n];
    //System.out.println(Arrays.toString(height));

    for(int i = 0; i < n; i++){
      height[i] = input.nextDouble();
      totalHeight += height[i];

    }
    System.out.printf("AVERAGE HEIGHT = %.2f\n", totalHeight / n);

  }
}
