import java.util.Scanner;

public class Exercicio01 {
  public static void main (String[] args) {
    int password;
    Scanner input = new Scanner(System.in);

    password = input.nextInt();

    while(password != 2002) {
      System.out.println("Senha Invalida");
      password = input.nextInt();
    }
    System.out.println("Acesso Permitido");
  }
}
