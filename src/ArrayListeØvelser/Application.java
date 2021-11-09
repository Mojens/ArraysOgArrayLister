package ArrayListeØvelser;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

  Person person1 = new Person("Harry", "Potter", "Gryffindor");
  Person person2 = new Person("Parvati", "Patil", "Gryffindor");
  Person person3 = new Person("Draco", "Malfoy", "Slytherin");
  Person person4 = new Person("Luna", "Lovegood", "Ravenclaw");
  Person person5 = new Person("Padma", "Patil", "Ravenclaw");
  static ArrayList<Person> personList = new ArrayList<>();

  public void test1(ArrayList<Person> personList) {
    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    personList.add(person4);
    personList.add(person5);

    System.out.println(personList);
  }

  public void test2(String firstName) {

    Scanner input = new Scanner(System.in);
    firstName = input.nextLine();
    for (Person person : personList){
      System.out.println();
    }
  }

  public static void start() {
    Application app = new Application();
    app.test1(personList);
    app.test2("Harry");
  }

  public static void main(String[] args) {
    start();
  }
}

