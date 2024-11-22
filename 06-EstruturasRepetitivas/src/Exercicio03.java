import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    int fuelCode;
    int alcohol = 0, diesel = 0, gasoline = 0;
    Scanner input = new Scanner(System.in);

    fuelCode = input.nextInt();

    while(fuelCode != 4) {
      switch(fuelCode){
        case 1:
          alcohol++;
          break;
        case 2:
          gasoline++;
          break;
        case 3:
          diesel++;
          break;
      }
      fuelCode = input.nextInt();
    }
    System.out.println("MUITO OBRIGADO");
    System.out.printf("Alcool: %d\n", alcohol);
    System.out.printf("Gasolina: %d\n", gasoline);
    System.out.printf("Diesel: %d\n", diesel);
  }
}