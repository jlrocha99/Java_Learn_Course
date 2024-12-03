package entities;

public class Product02 {
  private String name;
  private double price;
  private int quantity;

  public Product02() {
  }
  public Product02(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public Product02(String name, double price) {
    this.name = name;
    this.price = price;
  }

  //metodos modificadores Getters e Setters para modificar os atributos privados
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void getPrice(double price) {
    this.price = price;
  }
  public double setPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public double totalValueInStock() {
    return(quantity * price);
  }
  public void addProducts(int quantity) {
    this.quantity += quantity;

  }
  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    return(
        name + ", " + "$ " + String.format("%.2f", price) + ", " + quantity + " units, " + "Total: " + "$ "
            + String.format("%.2f", totalValueInStock())
    );
  }
}
