package Application;

import Entities.BusinessAccount;

import java.util.Locale;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    BusinessAccount account = new BusinessAccount(10, "John", 1000.00, 100.00);

    System.out.println(account.getNumber());
    System.out.println(account.getHolder());
    System.out.println(account.getBalance());
    System.out.println(account.getLoanLimit());

  }

}
