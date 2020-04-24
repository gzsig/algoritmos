/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    DoublyLinkedList lista = new DoublyLinkedList();

    Student Std1 = new Student(123, "Std1", 5, 5);
    Student Std2 = new Student(456, "Std2", 5, 5);
    Student Std3 = new Student(789, "Std3", 5, 5);

    lista.unshift(Std1);
    lista.unshift(Std2);
    lista.push(Std3);

    lista.print();
    lista.findAndRemove(123);
    lista.findAndRemove(789);
    lista.findAndRemove(456);

    lista.print();
  }
}