import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Playlist playlist = new Playlist();
    int command;
    System.out.println(
        "1 - Inserir musica na playlist\n2 - Tocar musica\n3 - Remover musica\n4 - Exibir as mais tocadas\n5 - finalizar\n");
    command = keyboard.nextInt();
    while (command != 5) {
      evaluateCommand(playlist, command, keyboard);
      System.out.println(
          "1 - Inserir musica na playlist\n2 - Tocar musica\n3 - Remover musica\n4 - Exibir as mais tocadas\n5 - finalizar\n");
      command = keyboard.nextInt();

    }
    playlist.print();
    keyboard.close();
  }

  public static boolean evaluateCommand(Playlist playlist, int command, Scanner keyboard) {
    switch (command) {
      case 1:
        System.out.println("Vamos inserir uma musica nova :)");
        Song tmp = new Song();
        tmp.createMe(tmp, keyboard);
        playlist.push(tmp);
        System.out.println("Oba, nova musica na playlist");
        break;
      case 2:
        System.out.println("Bora escutar um som?");
        playlist.play("mus");
        break;
      case 3:
        System.out.println("Cansou? Então bora excluir!");
        break;
      case 4:
        System.out.println("Hora da verdade... Vamos ver o que você anda escutando");
        break;
      case 5:
        System.out.println("Au revoir, à bientôt");
        break;

      default:
        System.out.println("Comando não encontrado.");
        playlist.print();
        break;
    }
    return true;
  }
}