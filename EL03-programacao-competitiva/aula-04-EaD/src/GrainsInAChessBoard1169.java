import java.util.Scanner;

/**
 * GrainsInAChessBoard
 */
public class GrainsInAChessBoard1169 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int x = keyboard.nextInt();
    int grains = 1, day = 1;
    while (day <= x) {
      grains *= 2;
      day++;
    }
    System.out.println(grains / 12000 + " kg");
    keyboard.close();
  }
}