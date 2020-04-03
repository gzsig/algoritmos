import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    List myArray = new List();

    BankAccount conta = new BankAccount();
    conta.name = "Gabe";

    BankAccount conta1 = new BankAccount();
    conta1.name = "Joao";

    BankAccount conta2 = new BankAccount();
    conta2.name = "Fabio";

    myArray.unshift(conta);
    myArray.unshift(conta1);
    myArray.push(conta2);

    myArray.print();

    // Scanner keyboard = new Scanner(System.in);
    // BankAccount conta = new BankAccount();
    // conta.name = "Gabe";
    // conta.id = "123 456 789 01";
    // accountInfo(conta);
    // keyboard.close();
  }

  // public static void accountInfo(BankAccount instance) {
  // System.out.println("Name: " + instance.name);
  // System.out.println("Id: " + instance.id);
  // System.out.println("Total Amount: " + instance.getTotal());
  // }
}