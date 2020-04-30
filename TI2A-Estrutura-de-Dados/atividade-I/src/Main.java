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
    System.out.println("Au revoir, à bientôt");
    keyboard.close();
  }

  public static boolean evaluateCommand(Playlist playlist, int command, Scanner keyboard) {
    String title;
    switch (command) {
      case 1:
        System.out.println("Vamos inserir uma musica nova :)");
        Song tmp = new Song();
        tmp.createMe(tmp, keyboard);
        playlist.push(tmp);
        System.out.println("Oba, nova musica na playlist");
        break;
      case 2:
        System.out.println("Bora escutar um som?\nComo chama a musica que vc quer escutar?");
        keyboard.nextLine();
        title = keyboard.nextLine();
        playlist.play(title);
        break;
      case 3:
        System.out.println("Cansou? Então bora excluir!\nComo chama a musica que vc quer excluir?");
        keyboard.nextLine();
        title = keyboard.nextLine();
        playlist.remove(title);
        break;
      case 4:
        System.out.println("Hora da verdade... Vamos ver o que você anda escutando");
        playlist.topSongs();
        break;

      default:
        System.out.println("Comando não encontrado. Mas aqui estão todas a musicas :)");
        playlist.print();
        break;
    }
    return true;
  }
}