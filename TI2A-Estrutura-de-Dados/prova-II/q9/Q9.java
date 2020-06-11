/**
 * Q9
 */
public class Q9 {

  public static void main(String[] args) {
    System.out.println(gcd(100, 200));
  }

  public static int gcd(int x, int y) {
    if (x == y) {
      return x;
    } else if (x > y) {
      return gcd(x - y, y);
    } else {
      return gcd(y, x);
    }
  }
}