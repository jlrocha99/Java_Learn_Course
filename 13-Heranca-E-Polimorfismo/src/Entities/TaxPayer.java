package Entities;

public abstract class TaxPayer {
  protected String name;
  protected Double annualIncome;

  public TaxPayer() {
  }
  public TaxPayer(String name, Double annualIncome) {
    super();
    this.name = name;
    this.annualIncome = annualIncome;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Double getAnnualIncome() {
    return annualIncome;
  }
  public void setAnnualIncome(Double annualIncome) {
    this.annualIncome = annualIncome;
  }

  public abstract Double tax();
















}
