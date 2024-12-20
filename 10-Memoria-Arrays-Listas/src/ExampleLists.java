import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.Iterator;

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

    System.out.println();
    //Principais operacoes em Listas

    //1-Adicionar Elementos
    numbers.add(50);
    System.out.println("New Number Add " + numbers);

    //2-Acessar Elementos
    System.out.println("Acess by index (1): " + vectNames.get(1));

    //3-Modificar Elementos
    tasks.set(1, "Run");
    System.out.println("Modify elements by index (1): " + tasks);

    //4-Remover Elementos
    vectNames.remove(1);
    System.out.println("Remove element in index (0): " + vectNames);
    tasks.add("test");
    tasks.add("Study");
    tasks.add("Swim");
    tasks.add("Study");
    tasks.remove("Study");
    System.out.println("Remove all appear: " + tasks);

    //5-Verificar o Tamanho
    System.out.println("Verify the number of elements in list: " + vectNames.size());

    System.out.println();
    //6-Iterar sobre os Elementos

    //For Loop
    for(int i = 0; i < vectNames.size(); i++) {
      System.out.println("For Loop : " + vectNames.get(i));
    }

    //For-each loop
    for(String serieNames : vectNames) {
      System.out.println("Using For Each Loop: " + vectNames);
    }

    //Iterator
    Iterator<String> iterador = vectNames.iterator();
    while(iterador.hasNext()) {
      System.out.println("Using Iterator + While Loop: " + iterador.next());
    }
  }
}
