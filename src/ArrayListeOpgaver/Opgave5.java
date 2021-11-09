package ArrayListeOpgaver;

public class Opgave5 {
  public static void main(String[] args) {
    int[] field = {2, 20, 3, 13, 15, 3, 9, 10, 1, 5, 8}; //Her siger jeg der er 25 tomme heltal uden værdi
    System.out.println("for odd numbers: "); // her fortæller jeg at tallene der kommer er for ulige tal
    for (int i = 0; i < field.length; i++) {
      // her siger jeg så at indeks starter på 0
      // den slutter ved field.legth
      //den pluser med 1 hele tiden
      if (i % 2 != 0) { //Hvis indeksen er ulige
        field[i] = i;//så er array værdien også ulige
      }
      System.out.println(field[i]);
    }
  }
}

