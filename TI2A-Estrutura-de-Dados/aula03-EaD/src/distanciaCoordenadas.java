import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * distanciaCoordenadas
 */
public class distanciaCoordenadas {

  public static void main(final String[] args) {
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###.##");
    int[][] coords = new int[2][2];
    getCoords(coords, keyboard);
    System.out.println("Dist = " + df.format(calcDist(coords)));
    keyboard.close();
  }

  private static void getCoords(int[][] coords, Scanner keyboard) {
    for (int i = 0; i < coords[0].length; i++) {
      for (int j = 0; j < coords[1].length; j++) {
        System.out.println("Insert [" + i + ", " + j + "]");
        coords[i][j] = keyboard.nextInt();
      }
    }
    System.out.println("[" + coords[0][0] + ", " + coords[0][1] + "] & [" + coords[1][0] + ", " + coords[1][1] + "]");
  }

  private static double calcDist(int[][] coords) {
    double coord1, coord2;
    coord1 = Math.pow((coords[1][0] - coords[0][0]), 2);
    coord2 = Math.pow((coords[1][1] - coords[0][1]), 2);
    return Math.pow(coord1 + coord2, 0.5);
  }
}
