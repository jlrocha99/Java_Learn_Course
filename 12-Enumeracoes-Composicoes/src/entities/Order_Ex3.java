package entities;

import entities.enums.OrderStatus_Ex3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_Ex3 {
  private Date moment;
  private OrderStatus_Ex3 status;

  //Compositions
  private List<OrderItem_Ex3> items = new ArrayList<>();
  private Client_Ex3 client;

  public Order_Ex3(Date moment, OrderStatus_Ex3 status, Client_Ex3 client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus_Ex3 getStatus() {
    return status;
  }

  public void setStatus(OrderStatus_Ex3 status) {
    this.status = status;
  }

  public Client_Ex3 getClient() {
    return client;
  }

  public void setClient(Client_Ex3 client) {
    this.client = client;
  }

  public List<OrderItem_Ex3> getItems() {
    return items;
  }

  public void addItem(OrderItem_Ex3 item) {
    items.add(item);
  }
  public void removeItem(OrderItem_Ex3 item) {
    items.remove(item);
  }
}
