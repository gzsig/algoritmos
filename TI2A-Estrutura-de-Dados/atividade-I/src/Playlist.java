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

  public void search(String title) {
    Node searching = first;
    System.out.println("entrei");
    while (searching != null) {
      System.out.println(searching.data.title);
      if(searching.data.title.equals(title)){
        System.out.println("ACHEI");
        System.out.println(searching.data.title);
        System.out.println(searching.data.artist);
        System.out.println(searching.data.genre);
        break;
      }
      searching = searching.right;
    }
    System.out.println("sai");
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