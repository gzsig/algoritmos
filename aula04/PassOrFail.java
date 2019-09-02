import java.util.Scanner;

public class PassOrFail {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    double x1, x2, n;

    System.out.println("value of first grade?");
    x1 = keyboard.nextDouble();
    
    System.out.println("value of second grade");
    x2 = keyboard.nextDouble();

    n = (x1 + x2)/2;

    // System.out.println("media: " + n);

    if(n >= 7){
      System.out.println("Media: " + n + " APROVADO");
    } else {
      System.out.println("Media: "+ n + " REPROVADO");
    }

    keyboard.close();

  }

}