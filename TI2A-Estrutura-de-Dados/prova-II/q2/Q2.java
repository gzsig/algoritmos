/**
 * Q2
 */
public class Q2 {

  public static void main(String[] args) {
    System.out.println(pell(10)); //2378
    System.out.println(pell(197)); //Loop infinito
  }

  public static int pell(int x) {
    System.out.println("x= " + x);
    if (x == 0 || x == 1)
      return x;
    return 2 * pell(x - 1) + pell(x - 2);
  }
}