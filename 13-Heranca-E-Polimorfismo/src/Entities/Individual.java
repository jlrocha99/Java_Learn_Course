package Entities;

public class Individual extends TaxPayer {
  private Double healthExpenditures;

  public Individual() {
    super();
  }
  public Individual(String name, Double annualIncome, Double healthExpenditures) {
    super(name, annualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }
  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {
    if (annualIncome < 200.000) {
      return (annualIncome * 0.15);
    }
    else {
      if (healthExpenditures > 0) {
        double reduction = healthExpenditures * 0.5;
        return ((annualIncome * 0.25) -  reduction);
      }
      else {
        return (annualIncome * 0.25);
      }
    }
  }
}
