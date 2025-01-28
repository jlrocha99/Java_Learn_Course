package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

import java.util.Locale;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Account x = new Account(1020, "Alex", 1000.0);
    Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

    x.withDraw(50);
    y.withDraw(50);

    System.out.println("Account x instanciada com Account");
    System.out.println(x.getBalance());
    System.out.println();
    System.out.println("Account y instanciada com SavingsAccount");
    System.out.println(y.getBalance());


  }
}
