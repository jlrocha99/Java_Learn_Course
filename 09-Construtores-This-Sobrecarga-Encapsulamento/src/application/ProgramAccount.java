package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    Account account;

    System.out.print("Enter account number: ");
    int accountNumber = input.nextInt();
    input.nextLine();
    System.out.print("Enter account holder: ");
    String holder = input.nextLine();

    System.out.print("Is there initial deposit (y/n)? ");
    char answer = input.next().charAt(0);

    if(answer == 'y') {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = input.nextDouble();
      account = new Account(accountNumber, holder, initialDeposit);
    }
    else {
      account = new Account(accountNumber, holder);
    }

    System.out.println();
    System.out.println("Account data: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = input.nextDouble();
    account.bankDeposit(depositValue);
    System.out.println("Update account data: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    double withdrawValue = input.nextDouble();
    account.withdrawal(withdrawValue);
    System.out.println("Updated account data: ");
    System.out.println(account);
  }
}
