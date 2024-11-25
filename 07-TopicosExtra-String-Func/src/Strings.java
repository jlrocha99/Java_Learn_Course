public class Strings {
  public static void main(String[] args) {
    String original = "abcde FGHIJ ABC abc DEFG   ";
    //Formatar
    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    //Recortar
    String s04 = original.substring(2);
    String s05 = original.substring(2, 9);
    //Substituir
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xyz");
    //Buscar
    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");

    System.out.printf("Original: %s\n", original);
    System.out.printf("toLowerCase: %s\n", s01);
    System.out.printf("toUpperCase: %s\n", s02);
    System.out.printf("trim: %s\n", s03);
    System.out.printf("substring(2): %s\n", s04);
    System.out.printf("substring(2, 9): %s\n", s05);
    System.out.printf("replace('a', 'x'): %s\n", s06);
    System.out.printf("replace('abc', 'xyz'): %s\n", s07);
    System.out.printf("Index of 'bc': %d\n", i);
    System.out.printf("Last index of 'bc': %d\n", j);
  }
}
