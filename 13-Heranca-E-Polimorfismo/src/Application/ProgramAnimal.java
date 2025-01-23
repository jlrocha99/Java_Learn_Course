package Application;

import Entities.Animal;
import Entities.Dog;

public class ProgramAnimal {
  public static void main (String[] args) {
    Animal animal = new Animal();
    animal.emitirSom();
    System.out.println();

    Animal animal2 = new Dog(); //Upcasting
    animal2.emitirSom();

    System.out.println();
    Animal animal3 = new Dog();
    Dog dog = (Dog) animal3; //DownCasting

    animal3.emitirSom();  //animal3 agora e um cachorro e late
    dog.emitirSom();

  }
}
