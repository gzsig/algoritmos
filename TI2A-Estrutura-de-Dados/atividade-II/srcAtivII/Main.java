import java.util.Random;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Fifo<String> circle = new Fifo<String>();
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    String nextStudent;
    int pickedStudent, randomNumber;

    System.out.println("Digite o nome dos alunos e ao final um enter em branco");

    nextStudent = keyboard.nextLine();

    while (nextStudent.length() != 0) {
      circle.push(nextStudent);
      nextStudent = keyboard.nextLine();
    }

    pickedStudent = rand.nextInt(circle.size() - 0);
    while (circle.size() > 0) {
      circle.print();
      randomNumber = rand.nextInt(circle.size() * 2 - 1) + 1;
      if (pickedStudent > circle.size()) {
        pickedStudent = 0;
      }
      System.out.println("Aluno com a batata na mão: " + pickedStudent);
      System.out.println("Número aleatorio: " + randomNumber);

      for (int i = randomNumber; i > 0; i--) {
        pickedStudent++;
        if (pickedStudent > circle.size()) {
          pickedStudent = 0;
        }
      }

      circle.findAndRemove(pickedStudent);
      circle.print();
      System.out.println("\n\n");
    }
    System.out.println("O vencedor foi:");
    circle.print();
    keyboard.close();
  }
}