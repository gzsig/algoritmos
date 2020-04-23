/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

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
      System.out.println(toPrint.data.title);
      toPrint = toPrint.right;
    }
  }

}