package entities;

public class Car {
  private String modelo;
  private Motor motor;

  public Car(String modelo, Motor motor) {
    this.modelo = modelo;
    this.motor = motor;
  }

  public void ligarCarro() {
    System.out.println("Ligando o carro modelo " + modelo + "...");
    motor.ligar();
  }

}
