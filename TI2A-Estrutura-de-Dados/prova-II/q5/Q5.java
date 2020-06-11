/**
 * Q5
 */
public class Q5 {

  public static void main(String[] args) {
    System.out.println(findDigit(24544, 9));
  }

  public static int findDigit(int n, int k) {
    int occurrences = 0;
    if (n == 0) {
      occurrences = 0;
    } else if (n % 10 == k) {
      occurrences++;
      occurrences += findDigit(n / 10, k);
    } else {
      occurrences += findDigit(n / 10, k);
    }
    return occurrences;
  }
}