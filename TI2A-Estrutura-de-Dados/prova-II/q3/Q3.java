/**
 * Q3
 */
public class Q3 {

  public static void main(String[] args) {
    System.out.println(somatoryNtoZeroRec(6));
    System.out.println(somatoryNtoZeroLoop(6));
  }

  public static int somatoryNtoZeroRec(int n) {
    if (n <= 0)
      return 0;
    return n + somatoryNtoZeroRec(n - 1);
  }

  // Essa função faz o somatorio de 0 até n
  public static int somatoryNtoZeroLoop(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}