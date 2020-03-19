import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    double base, height, perimeter, area;

    System.out.println("What is the base of the rectangle?");
    base = keyboard.nextDouble();

    System.out.println("What is the height of the rectangle?");
    height = keyboard.nextDouble();

    perimeter = (base * 2) + (height * 2);
    area = (base * height);

    System.out.println("The perimeter of rectangle is: " + perimeter);
    System.out.println("The area of rectangle is: " + area);

    keyboard.close();

  }

}