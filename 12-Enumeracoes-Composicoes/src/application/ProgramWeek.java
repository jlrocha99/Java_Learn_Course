package application;

import entities.enums.DiaDaSemana;

public class ProgramWeek {
  public static void main (String[] args) {

    System.out.println();
    System.out.println("Metodo values()");
    for(DiaDaSemana dia : DiaDaSemana.values()) { //values() ->Retorna uma array com todas as constantes da enumeracao
      System.out.println(dia + ": " + dia.getDescricao());
    }

    System.out.println();
    System.out.println("Metodo ordinal()");
    for(DiaDaSemana dia : DiaDaSemana.values()) {
      System.out.println(dia + ": " + dia.ordinal()); //ordinal() -> Retorna a posicao da constante dentro da enumeracao
    }

    System.out.println();
    System.out.println("Metodo name()");
    String test = DiaDaSemana.SEGUNDA.name();
    System.out.println(DiaDaSemana.SEGUNDA.name()); //name() -> Retorna o nome da constante como uma String
    System.out.printf("type: %s\n", test); //testar se realmente virou uma String

    System.out.println();
    System.out.println("Metodo valueOf(String name)");
    DiaDaSemana dia = DiaDaSemana.valueOf("TERCA"); //valueof() -> Converte uma String no valor correspondente da enumeracao
    System.out.println(dia);
    System.out.printf("Test Enum: %s", dia.getDescricao()); //o método getDescricao() me confirmou que 'dia' é um Enum

  }
}
