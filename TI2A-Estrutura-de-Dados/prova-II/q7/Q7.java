/**
 * Q7
 */
public class Q7 {

  public static void main(String[] args) {
    System.out.println(ackermann(10, 4));
  }

  public static int ackermann(int m, int n) {
    if (m == 0)
      return n + 1;
    if (m > 0 && n == 0)
      return ackermann(m - 1, n);
    if (m > 0 && n > 0)
      return ackermann(m - 1, ackermann(m, n - 1));
    return 0;
  }
}