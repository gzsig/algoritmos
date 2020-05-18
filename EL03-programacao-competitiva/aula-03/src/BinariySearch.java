import java.util.Random;
import java.util.Scanner;

/**
 * BinariySearch
 */
public class BinariySearch {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int[] array = new int[100];
    int num;
    num = keyboard.nextInt();
    populate(rand, array);
    arraySort(array);
    print(array);
    if (includes(array, num)) {
      System.out.println("includes");
    }
    keyboard.close();
  }

  public static void print(int[] array) {
    System.out.print("[ ");
    for (int i = 0; i < array.length; i++) {
      if (i+1 != array.length) {
        System.out.print(array[i] + ", ");
      }else{
        System.out.print(array[i]);
      }
    }
    System.out.println(" ]");
  }

  public static void populate(Random rand, int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(1000);
    }
  }

  public static void arraySort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static boolean includes(int[] array, int num) {
    int l = 0;
    int r = array.length - 1;
    while (l <= r) {
      int m = (l + r) / 2;
      if (array[m] < num) {
        l = m + 1;
      } else if (array[m] > num) {
        r = m - 1;
      } else {
        return true;
      }
    }
    return false;
  }

}