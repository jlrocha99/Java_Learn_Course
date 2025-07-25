package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  //Compositions
  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
    this.name = name;
    this.level = workerLevel;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }
  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }
  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Department getDepartment() {
    return department;
  }
  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  //O  metodo setContracts faz com que eu atribua uma nova lista a minha lista de contatos, ou seja causando uma troca de listas e não uma inserção ou deleção

  //Inserções e deleções na lista Contracts serão feita pelos métodos abaixo;
  public void addContract(HourContract contract) {
    contracts.add(contract);
  }
  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

  public Double income(Integer year, Integer month) {
    double sum = baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HourContract c : contracts) {
      cal.setTime(c.getDate());
      int c_year = cal.get(Calendar.YEAR);
      int c_month = 1 + cal.get(Calendar.MONTH);
      if (year == c_year && month == c_month) {
        sum += c.totalValue();
      }
    }
    return sum;
  }

















}
