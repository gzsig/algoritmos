/**
 * DoublyLinkedList
 */
public class Playlist {

  Node first;
  Node last;

  public void push(Song instance) {
    Node tmp = new Node();
    tmp.data = instance;
    if (first == null) {
      first = last = tmp;
    } else {
      last.right = tmp;
      tmp.left = last;
      last = tmp;
    }
  }

  public Node search(String title) {
    Node searching = first;
    System.out.println("entrei");
    while (searching != null) {
      System.out.println(searching.data.title);
      if (searching.data.title.equals(title)) {
        System.out.println("ACHEI");
        return searching;
      }
      searching = searching.right;
    }
    System.out.println("sai");
    return searching;
  }

  public void play(String title) {
    Node song = search(title);
    if (song != null){
      song.data.playTimes ++;
    } else {
      System.out.println("Xii, não encontrei essa ai");
    }
  }

  public void print() {
    Node toPrint = first;
    while (toPrint != null) {
      System.out.println("Titulo: " + toPrint.data.title);
      System.out.println("Artista: " + toPrint.data.artist);
      System.out.println("Genero: " + toPrint.data.genre);
      System.out.println("Vezes tocada: " + toPrint.data.playTimes);
      toPrint = toPrint.right;
    }
  }

}