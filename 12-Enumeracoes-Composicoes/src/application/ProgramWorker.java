package application;

import entities.Department;
import entities.HourContract;
import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class ProgramWorker {
  private String name;
  private WorkerLevel workerLevel;
  private Double salary;

  //Compositions
  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public ProgramWorker(String name, WorkerLevel workerLevel, Double salary, Department department) {
    this.name = name;
    this.workerLevel = workerLevel;
    this.salary = salary;
    this.department = department;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getWorkerLevel() {
    return workerLevel;
  }
  public void setWorkerLevel(WorkerLevel workerLevel) {
    this.workerLevel = workerLevel;
  }

  public Double getSalary() {
    return salary;
  }
  public void setSalary(Double salary) {
    this.salary = salary;
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

  //Não posso permitir que minha lista seja trocada por outra (método setContracts faz isso),
  //O método setContracts faz com que eu atribua uma nova lista a minha lista de contatos, ou seja causando uma troca de listas e não uma inserção ou deleção
  //setContracts simplesmente recebe outra lista, ou seja substituindo-a coisa que não desejo
  public void setContracts(List<HourContract> contracts) {
    this.contracts = contracts;
  }

  //Inserções e deleções na lista Contracts serão feita pelos métodos abaixo;
  public void addContract(HourContract contract) {
    contracts.add(contract);
  }
  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

















}
