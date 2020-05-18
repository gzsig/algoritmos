import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n, x, res;
    System.out.println("valor de n?");
    n = keyboard.nextInt();
    System.out.println("valor de x");
    x = keyboard.nextInt();
    res = 0;
    for (int i = 0; i <= n; i++) {
      res += Math.pow(x, i);
    }
    System.out.println(res);
    keyboard.close();
  }
}