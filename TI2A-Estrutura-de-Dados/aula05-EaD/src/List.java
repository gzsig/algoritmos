/**
 * List
 */
public class List {

  Knot first, last;

  public void unshift(BankAccount instance) {
    Knot temp = new Knot();
    temp.data = instance;
    if (first == null && last == null) {
      first = temp;
      last = temp;
      temp.next = null;
    } else {
      temp.next = first;
      first = temp;
    }
  }

  public void push(BankAccount instance) {
    Knot temp = new Knot();
    temp.data = instance;
    if (first == null && last == null) {
      first = temp;
      last = temp;
      temp.next = null;
    } else {
      last.next = temp;
      last = temp;
      temp.next = null;
    }
  }

  public void print() {
    Knot temp = first;
    while (temp != null) {
      System.out.println(temp.data.name);
      temp = temp.next;
    }
  }

}