package Entities;

public class Products02 {
    private String name;
    private double price;

    public Products02(String name, double price) {
      this.name = name;
      this.price = price;
    }
    public void getName(String name) {
      this.name = name;
    }
    public String setName() {
      return name;
    }

    public void setPrice(double price) {
      this.price = price;
    }
    public double getPrice() {
      return price;
    }
}
