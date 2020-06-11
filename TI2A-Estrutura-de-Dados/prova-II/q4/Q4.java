/**
 * Q4
 */
public class Q4 {

  public static void main(String[] args) {
    System.out.println(binaryRec(56));
    System.out.println(binaryLoop(56));
  }

  public static int binaryRec(int decimal) {
    if (decimal == 0)
      return 0;
    return decimal % 2 + 10 * binaryRec(decimal / 2);
  }

  public static int binaryLoop(int decimal) {
    int res = 0;
    int cont = 0;
    while (decimal > 0) {
      res += decimal % 2 * Math.pow(10, cont);
      decimal /= 2;
      cont++;
    }
    return res;
  }
}