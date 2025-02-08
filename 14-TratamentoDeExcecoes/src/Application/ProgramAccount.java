package Application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    try {
      System.out.println("Enter account data");
      System.out.print("Number: " );
      int number = input.nextInt();
      input.nextLine();
      System.out.print("Holder: ");
      String holder = input.nextLine();
      System.out.print("Initial balance: ");
      double initialBalance = input.nextDouble();
      System.out.print("Withdraw limit: ");
      double withdrawLimit = input.nextDouble();

      Account account = new Account(number, holder, initialBalance, withdrawLimit);

      System.out.println();
      System.out.print("Enter amount for withdraw: ");
      double amount = input.nextDouble();

      account.withdraw(amount);
      System.out.printf("New Balance: %.2f\n", account.getBalance());
    }
    catch (InputMismatchException ime) {
      System.out.println("Invalid data!");
    }
    catch (BusinessException de) {
      System.out.println(de.getMessage());
    }
    catch (RuntimeException re) {
      System.out.println("Unexpected Error!");
    }

  }
}
