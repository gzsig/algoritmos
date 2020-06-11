/**
 * Q2
 */
public class Q2 {

  public static void main(String[] args) {
    System.out.println(pell(10)); 
    //2378
    System.out.println(pell(197)); 
    // Loop infinito, pois, apos algumas chamadas recursivas, o valor
    // excede  o valor maximo de uma variavel do tipo int e assim perde
    // precisão nunca alcançando a condição de parada.
  }

  public static int pell(int x) {
    if (x == 0 || x == 1)
      return x;
    return 2 * pell(x - 1) + pell(x - 2);
  }
}