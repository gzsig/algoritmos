/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Fifo<Double> test = new Fifo<Double>();

    test.push(12.0);
    test.unshift(11.0);
    test.unshift(9.0);
    test.print();
    test.findAndRemove(1);
    test.print();
  }
}