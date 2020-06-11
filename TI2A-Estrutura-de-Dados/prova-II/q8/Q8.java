/**
 * Q8
 */
public class Q8 {

  public static void main(String[] args) {
    System.out.println(binomial(5, 2));
  }

  public static int binomial(int n, int k) {
    if (k != 0 && n != k) {
      return binomial(n - 1, k) + binomial(n - 1, k - 1);
    } else {
      return 1;
    }
  }

}