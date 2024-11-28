package entities;

public class Employee {
  public String name;
  public double grossSalary;  //6000
  public double tax;  //1000

  public double netSalary() {
    return(grossSalary - tax); //5000
  }
  public void increaseSalary(double percentage) {
    grossSalary = grossSalary + grossSalary * (percentage/100);// +=
  }
  public String toString() {
    return(name + ", $ " + netSalary());
  }
}
