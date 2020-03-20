import java.util.Random;

/**
 * arrayManipulation
 */
public class arrayManipulation {

  public static void main(String[] args) {
    Random rand = new Random();
    int[] array = new int[11];
    arrayRandomFill(array, rand);
    System.out.println("Array inicial:");
    arrayPrint(array);
    arrayInvert(array);
    System.out.println("Array inversa:");
    arrayPrint(array);
  }

  private static void arrayRandomFill(int[] array, Random rand) {
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(10);
    }
  }

  private static void arrayPrint(int[] array) {
    System.out.print("[ ");
    for (int i = 0; i < array.length; i++) {
      if (i != array.length - 1) {
        System.out.print(array[i] + ", ");
      } else {
        System.out.print(array[i]);
      }
    }
    System.out.print(" ] \n");
  }

  private static void arrayInvert(int[] array) {
    int temp, len;
    len = array.length - 1;
    for (int i = 0; i < array.length / 2; i++) {
      temp = array[i];
      array[i] = array[len];
      array[len] = temp;
      len--;
    }
  }
}