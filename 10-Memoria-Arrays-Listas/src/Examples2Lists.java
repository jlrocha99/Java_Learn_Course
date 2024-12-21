import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Examples2Lists {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco");

    System.out.println(list.size());
    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("----------------");
    //list.remove("Anna");
    //list.remove(1);
    list.removeIf(x -> x.charAt(0) == 'M'); //Expressão Lambda
    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("----------------");
    System.out.println("Index of Bob: " + list.indexOf("Bob"));
    System.out.println("Index Of Marco: " + list.indexOf("Marco"));
    System.out.println("----------------");
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
    for (String x : result) {
      System.out.println(x);
    }

    System.out.println("----------------");
    String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(name);





  }
}
