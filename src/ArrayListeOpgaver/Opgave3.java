package ArrayListeOpgaver;

public class Opgave3 {
  public static void main(String[] args) {
    System.out.println("Fra Carl:  \n");
    String[] names = {"Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl"};
    //Her laver en string arrray med forskellige navne
    for (int i = names.length-1;i>=0;i--)
      //Her siger jeg int i = name.length-1 hvilket betyder starten på arrayen skal være ved slutningen altså "carl"
      // her siger jeg at i>=0 altså at den stopper når den rammer 0
      // i-- altså at indeksen -1 hver gang
      System.out.println(names[i]+""); //Her printer jeg det ud

    System.out.println("\nFra Jonas: \n"); //Fra jonas
    for (int x = 0;x <= names.length-1;x++)
      //Her siger jeg x=0 da indeks skal starte derfra
      //Her siger jeg x<=names.length-1 da den skal stoppe der
      // x++ så den stiger med 1 for hvergang altså indeksen
      System.out.println(names[x]+"");



  }

}

