import java.util.Scanner;
/**
 * MainStudent
 */
public class MainStudent {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Student me = new Student();
    System.out.println("What's your name?");
    me.name = keyboard.next();
    System.out.println("whats your student ID (6 digits)");
    me.ra = keyboard.nextInt();
    System.out.println("What was your first grade?");
    me.grade1 = keyboard.nextDouble();
    System.out.println("What was your second grade?");
    me.grade2 = keyboard.nextDouble();
    me.getAverage();
    if (me.getStatuss().equalsIgnoreCase("pass")) {
      System.out
          .println("Hello, my name is " + me.name + ", my student ID is " + me.ra + " and I passed with " + me.average);
    } else if (me.getStatuss().equalsIgnoreCase("fail")) {
      System.out
          .println("Hello, my name is " + me.name + ", my student ID is " + me.ra + " and I failed with " + me.average);
    }
    keyboard.close();
  }
}