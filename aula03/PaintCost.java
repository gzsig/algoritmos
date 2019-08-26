import java.util.Scanner;

public class PaintCost {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    double height, radius, area, cost, numberOfCans;

    System.out.println("What is the radius of the cilinder?");
    radius = keyboard.nextDouble();
    System.out.println("What is the height of the cilinder?");
    height = keyboard.nextDouble();

    area = (2 * Math.PI * radius) * (height + radius);

    numberOfCans = Math.ceil(area / (5 * 3));

    cost = numberOfCans * 220;

    System.out.println("area: " + area);
    System.out.println("numberOfCans: " + numberOfCans);
    System.out.println("cost: " + cost);

    keyboard.close();

  }
}