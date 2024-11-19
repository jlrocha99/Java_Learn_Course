import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    int hourStart, hourEnd, finalHour = 0;
    Scanner input = new Scanner(System.in);

    hourStart = input.nextInt();
    hourEnd = input.nextInt();

    if(hourStart < hourEnd ) {
      finalHour = hourEnd - hourStart;
      System.out.printf("O JOGO DUROU %d HORA(S)\n", finalHour);
    }
    else {
      finalHour = (24 - hourStart) + hourEnd;
      System.out.printf("O JOGO DUROU %d HORA(S)\n", finalHour);
    }
  }
}
