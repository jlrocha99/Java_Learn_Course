package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<Account> accountList = new ArrayList<>();

    //Account acc1 = new Account(1001, "Alex", 1000.0); //Nao posso instanciar a minha classe Account por ser Abstract
    accountList.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
    accountList.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    accountList.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
    accountList.add(new BusinessAccount(1004, "Ana", 500.0, 500.0));

    double sum = 0;

    for (Account acc : accountList) {
      sum += acc.getBalance();
    }
    System.out.printf("Total balance: %.2f\n", sum);

    for (Account acc : accountList) {
      acc.deposit(10.0);
    }

    for (Account acc : accountList) {
      System.out.printf("Updated balance for account %d: %.2f\n",acc.getNumber(), acc.getBalance());
    }
  }
}
