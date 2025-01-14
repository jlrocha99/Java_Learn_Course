package application;

import entities.Car;
import entities.Motor;

public class ProgramAutomobile {
  public static void main(String[] args) {
    Motor motor = new Motor(120);
    Car car = new Car("Sedan", motor);

    car.ligarCarro();

  }
}
