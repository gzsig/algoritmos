import java.util.Scanner;

public class ExercicioUm {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int x1, x2, x3, x4, n;

    System.out.println("value of N?");
    n = keyboard.nextInt();

    x1 = n / 100;
    x2 = (n % 100) / 10;
    x3 = n % 10;

    x4 = x1 + x2 + x3;

    System.out.println(x4);

    keyboard.close();

  }

}