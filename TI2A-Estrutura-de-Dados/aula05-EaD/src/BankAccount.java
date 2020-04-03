/**
 * BankAccount
 */
public class BankAccount {

  String name, id;
  private double total;

  public void addToTotal(double amount) {
    total += amount;
    System.out.println("Your new balance is: 💸" + getTotal());
  }

  public void removeFromTotal(double amount) {
    if (total < amount) {
      System.out.println("Insufficient funds 😏");
    } else {
      total -= amount;
      System.out.println("Your new balance is: 💸" + getTotal());
    }
  }

  public double getTotal() {
    return total;
  }
}