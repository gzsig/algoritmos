/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    DoublyLinkedList lista = new DoublyLinkedList();

    Student gabe = new Student();
    Student du = new Student();
    Student tais = new Student();

    gabe.name = "Gabe";
    gabe.id = 123;
    du.name = "Du";
    du.id = 456;
    tais.name = "Tais";
    tais.id = 789;

    lista.unshift(gabe);
    lista.unshift(du);
    lista.push(tais);

    lista.print();
    lista.findAndRemove(123);
    lista.findAndRemove(789);
    lista.findAndRemove(456);

    lista.print();
  }
}