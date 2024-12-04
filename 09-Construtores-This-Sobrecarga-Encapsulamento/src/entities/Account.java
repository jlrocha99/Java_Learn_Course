package entities;

public class Account {
  private String holder;
  private int accountNumber;
  private double balance;

  //Constructors
  public Account(int accountNumber, String holder) {
    this.accountNumber = accountNumber;
    this.holder = holder;
  }

  public Account(int accountNumber, String holder, double initialDeposit) {
    this.accountNumber = accountNumber;
    this.holder = holder;
    bankDeposit(initialDeposit);
  }

  //get-set
  public int getAccountNumber() {
    return accountNumber;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }
  public String getHolder() {
    return holder;
  }

  public double getBalance() {
    return balance;
  }

  //Class Methods
  public void bankDeposit(double value) {
    balance += value;
  }
  public void withdrawal(double value) {
    balance -= value + 5;
  }

  public String toString() {
    return(
        "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ "
            + String.format("%.2f", balance)
        );
  }
}
