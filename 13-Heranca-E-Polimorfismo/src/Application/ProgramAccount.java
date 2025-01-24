package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

import java.util.Locale;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Account acc1 = new Account(1001, "Alex", 1000.0);
    acc1.withDraw(200.0);
    System.out.println("Metodo withdraw padrao da classe Accout: ");
    System.out.println(acc1.getBalance());

    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01); //UPCASTING
    acc2.withDraw(200.0);
    System.out.println("Upcasting + Sobreposicao do metodo withDraw");
    System.out.println(acc2.getBalance());  //Sobreposicao deu certo!

    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0); //UPCASTING
    acc3.withDraw(200.0);
    System.out.println("Upcasting + Sobreposicao do metodo withDraw + Super");
    System.out.println(acc3.getBalance());  //Sobreposicao + Super aproveitando a logica da classe Account

  }
}
