import java.util.Scanner;

public class BarcodeReader {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int c;
    System.out.println("value of Barcode?");
    c = keyboard.nextInt();

    if (String.valueOf(c).length() != 5) {
      System.out.println("not a vild length");
    } else {
      getPrice(c);
    }
    keyboard.close();
  }

  static void getPrice(int c) {
    int c1, c2, c3, c4, c5, p, p1, p2, p3p4;

    p3p4 = c / 1000;
    c1 = c / 10000;
    c2 = p3p4 % 10;
    c3 = (c / 100) % 10;
    c4 = (c / 10) % 10;
    c5 = c % 10;
    p2 = (c1 * c2 * c3 * c4 * c5) % 10;
    // p1 = ((c / 100) % 100)/10;
    p1 = c2;

    p = p1 * 1000 + (p2 * 100) + p3p4;

    System.out.println(p);

  }
}