import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

public class ExampleLists {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    //ArrayList
    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    System.out.println("My First List: " + numbers);

    //LinkedList
    List<String> tasks = new LinkedList<>();
    tasks.add("Study");
    tasks.add("Work");
    System.out.println("My First LinkedList: " + tasks);

    //Vector
    Vector<String> vectNames = new Vector<>();
    vectNames.add("Mads Mikkelsen");
    vectNames.add("Hugh Dance");
    System.out.println("My First Vector List: " + vectNames);

  }
}
