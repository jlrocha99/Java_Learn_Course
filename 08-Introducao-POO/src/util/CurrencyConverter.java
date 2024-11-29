package util;

public class CurrencyConverter {
  public static double IOF = 0.06;

  public static double converter(double real, double dollar) {
    return(real * dollar + (real * dollar * IOF));

  }
}
