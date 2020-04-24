/**
 * DoublyLinkedList
 */
public class DoublyLinkedList<T> {
  Node<T> first;
  Node<T> last;

  public void unshift(T instance) {
    Node tmp = new Node<T>(instance);
    if (first == null) {
      first = last = tmp;
    } else {
      first.left = tmp;
      tmp.right = first;
      first = tmp;
    }
  }

  public void push(T instance) {
    Node tmp = new Node<T>(instance);
    if (first == null) {
      first = last = tmp;
    } else {
      last.right = tmp;
      tmp.left = last;
      last = tmp;
    }
  }

  // public Node find(int id) {
  //   Node tmp = first;
  //   while (tmp != null && tmp.data.id != id) {
  //     tmp = tmp.right;
  //   }
  //   if (tmp == null) {
  //     System.out.println("id: " + id + " not found");
  //     return null;
  //   } else {
  //     System.out.println(tmp.data.name);
  //     return tmp;
  //   }
  // }

  // public boolean findAndRemove(int id) {
  //   Node tmp = find(id);
  //   if (tmp == null) {
  //     System.out.println("id: " + id + " not found");
  //     return false;
  //   } else if (tmp.left == null && tmp.right == null) {
  //     System.out.println("Only element in array");
  //     first = null;
  //     last = null;
  //     return false;
  //   } else if (tmp.left == null) {
  //     System.out.println("First element in array");
  //     tmp.right.left = null;
  //     first = tmp.right;
  //     return false;
  //   } else if (tmp.right == null) {
  //     System.out.println("Last element in array");
  //     tmp.left.right = null;
  //     last = tmp.left;
  //     return false;
  //   } else {
  //     System.out.println("Remove from middle");
  //     Node tmpPrev = tmp.left;
  //     Node tmpNext = tmp.right;
  //     tmpPrev.right = tmp.right;
  //     tmpNext.left = tmp.left;
  //     return false;
  //   }
  // }

  public void print() {
    Node<T> tmp = first;
    if (tmp == null) {
      System.out.println("list is empty");
    }
    while (tmp != null) {
      System.out.print(tmp.data + " ");
      tmp = tmp.right;
    }
  }

}