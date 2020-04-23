import java.util.Scanner;

/**
 * Song
 */
public class Song {

  String title;
  String artist;
  String genre;
  int playTimes;

  public void createMe(Song instance, Scanner keyboard) {
    System.out.println("Qual o nome da musica");
    keyboard.nextLine();
    instance.title = keyboard.nextLine();
    System.out.println("Quem toca isso?");
    instance.artist = keyboard.nextLine();
    System.out.println("Qual o genero?");
    instance.genre = keyboard.nextLine();
  }
}