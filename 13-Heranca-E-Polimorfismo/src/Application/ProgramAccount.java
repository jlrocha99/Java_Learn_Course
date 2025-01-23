package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

import java.util.Locale;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    BusinessAccount account = new BusinessAccount(10, "John", 1000.00, 100.00);

    System.out.println(account.getNumber());
    System.out.println(account.getHolder());
    System.out.println(account.getBalance());
    System.out.println(account.getLoanLimit());

    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    //UPCASTING
    Account acc1 = bacc;    //BusinessAccount e uma Account -> Por esse motivo nao tem problemas
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    System.out.println();
    System.out.println("UPCASTING: bacc -> acc1 ");
    System.out.println(acc1.getNumber() + " " + acc1.getHolder() + " " +  acc1.getBalance());
    System.out.println();

    System.out.println("UPCASTING: acc2 (businessAccount)");
    System.out.println(acc2.getHolder());

    System.out.println("UPCASTING: acc3 (SavingsAccount)");
    System.out.println(acc3.getHolder());


    // DownCasting
    //BusinessAccount acc4 = acc2; //Error -> Nao e possivel converter pois a variavel acc2 e do tipo Account e a acc4 e Business Accout, conversao nao segura
    //Realizando um Casting manual -> (BusinessAccount)acc2
    BusinessAccount acc4 = (BusinessAccount)acc2; //Agora eh permito pois realizei o DOWNCASTING confirmando ao compilador que acc2 foi instanciado como BusinesseAccount
    acc4.setLoanLimit(100.0); //acc4 e do tipo BusinessAccount logo podera usar a operacao Loan
    System.out.println();
    System.out.println("DOWNCASTING: acc4 ");
    System.out.println(acc4.getLoanLimit());

    //BusinessAccount acc5 = (BusinessAccount)acc3; //Nao pode ser realizado pois o tipo de acc3 e savingsAccount, DOWNCASTING NAO POSSIVEL
    if(acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount)acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");
    }
    if(acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount)acc3;
      acc5.updateBalance();
      System.out.println("Update!");
      System.out.println(acc5.getInterestRate());
    }
  }


}
