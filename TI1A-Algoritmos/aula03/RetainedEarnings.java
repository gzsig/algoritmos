import java.util.Scanner;
import java.text.DecimalFormat;

public class RetainedEarnings {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##.00");

    double initialValue, investRate, finalValue, duration;
    String finalValueStr;

    System.out.println("What is the Initial Value of investment?");
    initialValue = keyboard.nextDouble();

    System.out.println("What is the rate of the investment");
    investRate = keyboard.nextDouble();

    System.out.println("how many month will you leave the investment");
    duration = keyboard.nextDouble();

    finalValue = initialValue * Math.pow((1 + investRate), duration);

    finalValueStr = df.format(finalValue);

    System.out.println("finalValue: R$" + finalValueStr);

    keyboard.close();

  }
}