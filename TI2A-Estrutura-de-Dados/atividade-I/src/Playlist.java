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