package entities;

public class Product01 {
  public String name;
  public double price;
  public int quantity;

  //Criacao do meu metodo construtor o qual será executado do momento da instanciacao do meu objeto

  //Construtor padrao
  public Product01() {
  }
  //Sobrecarga de construtores
  public Product01(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  //Sobrecarga de construtores
  public Product01(String name, double price) {
    this.name = name;
    this.price = price;
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
        "TV, " + "$ " + String.format("%.2f", price) + ", " + quantity + " units, " + "Total: " + "$ "
            + String.format("%.2f", totalValueInStock())
        );
  }
}
