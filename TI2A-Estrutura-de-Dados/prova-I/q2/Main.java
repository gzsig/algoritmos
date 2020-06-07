/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Lista<Double> test = new Lista<Double>();
    test.inserirFinal(2.0);
    test.inserirFinal(4.0);
    test.inserirFinal(6.0);
    test.inserirInicio(1.0);
    test.print();
    System.out.println("Size of test is: " + test.size());
  }
}