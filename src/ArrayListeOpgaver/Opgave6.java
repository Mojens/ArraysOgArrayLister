package ArrayListeOpgaver;

import java.util.Arrays;

public class Opgave6 {
  public static void main(String[] args) {
    int inputNum = 3;
    int[] beforeField = {2, 3, 2, 1, 3, 5, 7, 8, 7, 8, 2, 6, 3};

    // Print InputNum
    System.out.println("Input to be removed: "
        + inputNum);

    // Remove the element
    beforeField = removeInputNum(beforeField,inputNum);

    // Print the resultant array
    System.out.println("Resultant Array: "
        + Arrays.toString(beforeField));
  }


  public static int[] removeInputNum(int[] beforeField, int inputNum) {
    // If the array is empty
    // or the index is not in array range
    // return the original array
    if (beforeField == null || inputNum < 0 || inputNum >= beforeField.length) {
      return beforeField;
    }
    int[] anotherArray = new int[beforeField.length - 1];
    for (int i = 0, k = 0; i < beforeField.length; i++) {
      if (i == inputNum) {
        continue;
      }

      // if the index is not
      // the removal element index
      anotherArray[k++] = beforeField[i];
    }

    // return the resultant array
    return anotherArray;
  }
}


