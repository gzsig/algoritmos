/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
  Knot first;
  Knot last;

  public void unshift(Student instance) {
    Knot tmp = new Knot();
    tmp.data = instance;
    if (first == null) {
      first = last = tmp;
    } else {
      first.previous = tmp;
      tmp.next = first;
      first = tmp;
    }
  }

  public void push(Student instance) {
    Knot tmp = new Knot();
    tmp.data = instance;
    if (first == null) {
      first = last = tmp;
    } else {
      last.next = tmp;
      tmp.previous = last;
      last = tmp;
    }
  }

  public Knot find(int id) {
    Knot tmp = first;
    while (tmp != null && tmp.data.id != id) {
      tmp = tmp.next;
    }
    if (tmp == null) {
      System.out.println("id: " + id + " not found");
      return null;
    } else {
      System.out.println(tmp.data.name);
      return tmp;
    }
  }

  public boolean findAndRemove(int id) {
    Knot tmp = find(id);
    if (tmp == null) {
      System.out.println("id: " + id + " not found");
      return false;
    } else if (tmp.previous == null && tmp.next == null) {
      System.out.println("Only element in array");
      first = null;
      last = null;
      return false;
    } else if (tmp.previous == null) {
      System.out.println("First element in array");
      tmp.next.previous = null;
      first = tmp.next;
      return false;
    } else if (tmp.next == null) {
      System.out.println("Last element in array");
      tmp.previous.next = null;
      last = tmp.previous;
      return false;
    } else {
      System.out.println("Remove from middle");
      Knot tmpPrev = tmp.previous;
      Knot tmpNext = tmp.next;
      tmpPrev.next = tmp.next;
      tmpNext.previous = tmp.previous;
      return false;
    }
  }

  public void print() {
    Knot tmp = first;
    if (tmp == null){System.out.println("list is empty");}
    while (tmp != null) {
      System.out.print(tmp.data.name + " ");
      System.out.println(tmp.data.id);
      tmp = tmp.next;
    }
  }

}