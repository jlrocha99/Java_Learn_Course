package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    System.out.print("Enter account number: ");
    int accountNumber = input.nextInt();
    System.out.print("Enter account holder: ");
    String holder = input.next();
    Account account = new Account(holder, accountNumber);

    System.out.println("Is there initial deposit (y/n)?");
    char answer = input.next().charAt(0);
    double value;

    if(answer == 'y') {
      System.out.print("Enter initial deposit value: ");
      value = input.nextDouble();
      account.bankDeposit(value);
    }
    System.out.println("Account data: ");
    System.out.println(account);

    System.out.print("Enter a deposit value: ");
    value = input.nextDouble();
    account.bankDeposit(value);
    System.out.println("Update account data: ");
    System.out.println(account);

    System.out.print("Enter a withdraw value: ");
    value = input.nextDouble();
    account.withdrawal(value);
    System.out.println("Updated account data: ");
    System.out.println(account);

  }
}
