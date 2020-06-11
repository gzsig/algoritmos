import java.util.Arrays;

/**
 * Q6
 */
public class Q6 {

  public static void main(String[] args) {
    int[] array = new int[] { 7, 9, 10, 60, 90, 3, 23, 18, 55, 11, 36 };
    System.out.println(getMaxValueRec(array));
    System.out.println(getMaxValueLoop(array));
  }

  public static int getMaxValueRec(int[] array) {
    if (array.length == 1)
      return array[0];
    int[] restArray = Arrays.copyOfRange(array, 1, array.length);
    return Math.max(array[0], getMaxValueRec(restArray));
  }

  public static int getMaxValueLoop(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i])
        max = array[i];
    }
    return max;
  }

}