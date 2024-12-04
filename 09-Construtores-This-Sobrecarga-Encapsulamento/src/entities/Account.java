package entities;

public class Account {
  private String holder;
  private int accountNumber;
  public double balance;

  public Account(String holder, int accountNumber) {
    this.holder = holder;
    this.accountNumber = accountNumber;
  }
  //get-set
  public void setHolder(String holder) {
    this.holder = holder;
  }
  public String getHolder() {
    return holder;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
  public int getAccountNumber() {
    return accountNumber;
  }

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
