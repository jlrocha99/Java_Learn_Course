package Entities;

import Entities.enums.Color;

public class Circle extends Shape{
  private Double radius;

  public Circle() {
    super();
  }
  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }
  public void setRadius(Double width) {
    this.radius = width;
  }


  @Override
  public Double area() {
    double pi = 3.14159;
    return pi * radius * radius;
  }
}
