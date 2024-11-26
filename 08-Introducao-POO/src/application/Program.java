package application;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      //Criando Objetos do tipo Triangle
      Triangle x, y;
      double perimeterX, perimeterY, areaX, areaY;
      //Instanciação dos meus objetos (realizando por consequência um alocação dinâmica na memória)
      x = new Triangle();
      y = new Triangle();
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the measure of the triangle X:");
      //Realizamos a leitura dos dados e armazenamos eles em cada atributos do meu objeto x
      x.a = input.nextDouble();
      x.b = input.nextDouble();
      x.c = input.nextDouble();

      System.out.println("Enter the measure of the triangle Y:");
      y.a = input.nextDouble();
      y.b = input.nextDouble();
      y.c = input.nextDouble();

      perimeterX = (x.a + x.b + x.c) / 2;
      perimeterY = (y.a + y.b + y.c) / 2;

      areaX = Math.sqrt(perimeterX * (perimeterX - x.a) * (perimeterX - x.b) * (perimeterX - x.c));
      areaY = Math.sqrt(perimeterY * (perimeterY - y.a) * (perimeterY - y.b) * (perimeterY - y.c));

      System.out.printf("Triangle X area: %.4f\n", areaX);
      System.out.printf("Triangle Y area: %.4f\n", areaY);

      if(areaX > areaY) {
        System.out.println("Larger Area: X");
      }
      else {
        System.out.println("Larger Area: Y");
      }
    }
  }
