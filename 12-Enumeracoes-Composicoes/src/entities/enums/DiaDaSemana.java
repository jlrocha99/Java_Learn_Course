package entities.enums;

public enum DiaDaSemana {
  SEGUNDA("Inicio da Semana"),
  TERCA("Segundo dia Util"),
  QUARTA("Meio da Semana"),
  QUINTA("Quase Sexta"),
  SEXTA("Fim da Semana"),
  SABADO("FIm de Semana"),
  DOMINGO("Descanso");

  private final String descricao;

  //Constructor
  DiaDaSemana(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }



}
