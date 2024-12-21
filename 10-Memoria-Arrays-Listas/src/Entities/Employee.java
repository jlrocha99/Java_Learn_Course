package Entities;

public class Employee {
  private String name;
  private int id;
  private double salary;

  public   Employee(int id, String name, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void increaseSalary(double percentage) {
    salary = salary + (salary * (percentage/100));
  }


  public String getName() {
    return name;
  }

  public String toString() {
    return(
        id + ", " + name + ", " + salary
        );
  }

}
