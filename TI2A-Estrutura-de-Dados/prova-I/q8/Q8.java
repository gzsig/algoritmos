/**
 * Q8
 */
public class Q8 {

  public static void main(String[] args) {
    int[][] estradas = new int[][] { { 1, 1, 1, 0 }, { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 0, 0, 1, 1 } };
    int res = easiestCityToArrive(estradas);
    System.out.println(res);
  }

  public static int easiestCityToArrive(int[][] array) {
    int roads = 0;
    int[] city = new int[] { -1, 0 };
    for (int i = 0; i < array.length; i++) {
      roads = 0;
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[j][i]);
        roads += array[j][i];
      }
      if (roads > city[1]) {
        city[0] = i;
        city[1] = roads;
      }
      System.out.println();
    }
    return city[0] + 1;
  }
}