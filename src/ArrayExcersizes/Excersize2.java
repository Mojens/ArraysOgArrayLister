package ArrayExcersizes;

public class Excersize2 {

  public static void main(String[] args) {
  }

  public static int banana(int[] a) {//Metoden returner et heltal, og der en integer array inde iden som hedder a.
    int kiwi = 1; //Her siger du at kiwi = 1
    int i = 0; //Her siger du i = 0
    while (i < a.length) { //a = array legth=betyder at den "stores the number of elements" altså ikke index men elements
      //her laver du en while loop der siger, hvis i < a.length
      kiwi = kiwi * a[i]; //så ændre den til at kiwi = kiwi*array[i]
      i++; // og så skal i +1
    }
    return kiwi; //Så skal den returne hele tallet som er kiwi i sætning 14
  }

  public static int grapefruit(int[] a, int grape) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == grape) {
        return i;
      }
    }
    return -1;
  }
}
