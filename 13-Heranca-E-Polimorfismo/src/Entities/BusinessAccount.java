package Entities;

//BussinessAccount herda todos os atributos e comportamentos da minha class Account
public class BusinessAccount extends Account {
  private Double loanLimit;

  public BusinessAccount() {
    super(); //executa a logica do construtor da SuperClass Account
  }
  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);  //Constructor SuperClass Account
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }
  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  public void loan(double amount) {
     if(amount <= loanLimit) {
       balance += amount - 10;
     }
  }

}
