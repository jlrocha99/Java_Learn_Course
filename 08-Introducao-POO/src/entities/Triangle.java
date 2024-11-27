package entities;

public class Triangle {
  //Atributos da minha classe Triangle, do tipo Double e acesso Publico
  public double a;
  public double b;
  public double c;

  public double area() {
    double perimeter = (a + b + c) / 2;
    return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));

  }
}
