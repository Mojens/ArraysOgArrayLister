package ArrayExcersizes;

public class Excersize1 {
  public static void main(String[] args) {
  }

  public static double[] powArray(double[] a, double b) { //[] = betyder array
    double[] power = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], 2.0);
      power[i] =Math.pow(a[i],b);
    }return power;
  }
}
