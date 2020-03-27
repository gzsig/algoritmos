import java.util.Scanner;

/**
 * triangleInfo
 */
public class triangleInfo {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double a, b, c, P, p, S, x, y, l;
    System.out.println("Size of side A?");
    a = keyboard.nextDouble();
    System.out.println("Size of side B?");
    b = keyboard.nextDouble();
    System.out.println("Size of side C?");
    c = keyboard.nextDouble();
    if (isValid(a, b, c)) {
      P = perimeter(a, b, c);
      p = semiPerimeter(P);
      S = area(a, b, c, p);
      l = lambda(a, b, c);
      x = centroidex(a, b, l);
      y = centroidey(a, l);
      System.out.println("perimeter:" + P);
      System.out.println("semiPerimeter: " + p);
      System.out.println("area: " + S);
      System.out.println("lambda: " + l);
      System.out.println("centroidex: " + x);
      System.out.println("centroidey: " + y);
    }
    keyboard.close();
  }

  private static boolean isValid(double a, double b, double c) {
    if (a + b > c && b + c > a && c + a > b) {
      return true;
    } else {
      System.out.println("Not a valid triangle");
      return false;
    }
  }

  private static double perimeter(double a, double b, double c) {
    double res = a + b + c;
    return res;
  }

  private static double semiPerimeter(double P) {
    double res = P / 2;
    return res;
  }

  private static double area(double a, double b, double c, double p) {
    double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return res;
  }

  private static double lambda(double a, double b, double c) {
    double res = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
    return res;
  }

  private static double centroidex(double a, double b, double l) {
    double res = (b + (a * l)) / 3;
    return res;
  }

  private static double centroidey(double a, double l) {
    double res = (a / 3) * Math.sqrt(1 - Math.pow(l, 2));
    return res;
  }
}