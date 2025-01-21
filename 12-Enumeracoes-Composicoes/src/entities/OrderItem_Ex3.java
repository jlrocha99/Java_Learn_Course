package entities;

public class OrderItem_Ex3 {
  private Integer quantity;
  private Double price;

  //Composition
  private Product_Ex3 product;
  //Constructor
  public OrderItem_Ex3(Integer quantity, Double price, Product_Ex3 product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  //Getters and Setters

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product_Ex3 getProduct() {
    return product;
  }
  public void setProduct(Product_Ex3 product) {
    this.product = product;
  }

  public Double subTotal() {
    return (quantity * price);
  }

  public String toString() {
    return (
        product.getName()
        + ", $"
        + String.format("%.2f", price)
        + ", Quantity: "
        + quantity
        + ", Subtotal: $"
        + String.format("%.2f",subTotal())
        );
  }
}