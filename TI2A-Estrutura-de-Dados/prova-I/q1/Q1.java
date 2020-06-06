/**
 * Q1
 */
public class Q1 {

  public static void main(String[] args) {
    int[] myIntArray = new int[] { 2, 5, 8, 3, 0, 1, 9, 4, 7, 6, 10 };
    Integer res = getCenterElement(myIntArray);
    System.out.println(res);
  }

  public static Integer getCenterElement(int[] array) {
    int checkLength = array.length;
    if (checkLength % 2 != 0) {
      return array[checkLength / 2];
    } else {
      System.out.println("Array does not have one center element!");
      return null;
    }
  }
}