import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    int axisX, axisY;
    Scanner input = new Scanner(System.in);
    axisX = input.nextInt();
    axisY = input.nextInt();

    while(axisX != 0 && axisY != 0) {
      //q1
      if(axisX > 0 && axisY > 0) {
        System.out.println("primeiro");
      }
      //q2
      else if(axisX < 0 && axisY > 0) {
        System.out.println("segundo");
      }
      //q3
      else if(axisX < 0 && axisY < 0) {
        System.out.println("terceiro");
      }
      //q4
      else if(axisX > 0 && axisY < 0) {
        System.out.println("quarto");
      }
      axisX = input.nextInt();
      axisY = input.nextInt();
    }
  }
}
