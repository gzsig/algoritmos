import java.util.Random;
import java.util.Scanner;

/**
 * array2Manipulation
 */
public class array2Manipulation {

  public static void main(String[] args) {
    Random rand = new Random();
    Scanner keyboard = new Scanner(System.in);
    int x, y, n;
    System.out.println("How big do the squared array?");
    n = keyboard.nextInt();
    int[][] array2 = new int[n][n];
    System.out.println("what column do you wish to sum?");
    x = keyboard.nextInt();
    System.out.println("what row do you wish to sum?");
    y = keyboard.nextInt();
    x--;
    y--;
    if (x > array2[1].length - 1 || y > array2[0].length - 1 || x < 0 || y < 0) {
      System.out.println("number out of range");
    } else {
      array2RandomFill(array2, rand);
      array2Print(array2);
      array2XSum(x, y, array2);
    }
    keyboard.close();
  }

  private static void array2RandomFill(int[][] array2, Random rand) {
    for (int i = 0; i < array2[0].length; i++) {
      for (int j = 0; j < array2[1].length; j++) {
        array2[i][j] = rand.nextInt(5);
      }
    }
  }

  private static void array2Print(int[][] array2) {
    for (int i = 0; i < array2[0].length; i++) {
      System.out.print("[ ");
      for (int j = 0; j < array2[1].length; j++) {
        System.out.print(array2[i][j] + ", ");
      }
      System.out.println(" ]");
    }
  }

  private static int array2XSum(int x, int y, int[][] array2) {
    int res = 0;
    for (int i = 0; i < array2[0].length; i++) {
      res += array2[i][x];
    }
    for (int i = 0; i < array2[1].length; i++) {
      res += array2[y][i];
    }
    res -= array2[y][x];
    System.out.println(res);
    return res;
  }
}