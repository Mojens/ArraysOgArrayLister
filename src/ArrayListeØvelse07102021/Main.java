package ArrayListeØvelse07102021;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] names = {"Simon", "Mo", "Malthe"};
    ArrayList<String> people = new ArrayList<>(List.of(names));
    people.add("Draco");
    people.add("Neville");
    people.add("Luna");
    people.remove("Neville");
    List youthree = people.subList(0,3);
    System.out.println(people);
    System.out.println(youthree);


    ArrayList nameList = new ArrayList();
    nameList.add("orale");
    nameList.add(1);
    nameList.add(2);
    nameList.add(3);
    System.out.println(nameList);

  }
}

