package ArrayListeOpgaver;

import java.util.Arrays;

public class Opgave7 {
  public static void main(String[] args) {
    int[] field = new int[25]; //Her siger jeg der er 25 tomme heltal uden værdi
    System.out.println("for odd numbers: "); // her fortæller jeg at tallene der kommer er for ulige tal
    for (int i = 0; i < field.length; i++) {
      // her siger jeg så at indeks starter på 0
      // den slutter ved field.legth
      //den pluser med 1 hele tiden
      if (i % 2 != 0) { //Hvis indeksen er ulige
        field[i] = i;//så er array værdien også ulige
      }

      System.out.println(field[i]); // printe de ulige tal og skrive 0 ved de lige tal
    }
    //Her forneden er det præcis det samme der foregår, bare hvor if sætningen er ændret.
    int[] fields = new int[25];
    System.out.println("for even numbers: ");
    for (int x = 0; x < fields.length; x++) {
      if (x % 2 == 0) { //denne er ændret til at det nu er med lige tal den finder.
        fields[x] = x;
      }
      System.out.println(fields[x]);
    }
  }
}
