/**
 * Account
 */
public class Account {
  String name;
  private double total = 2000;
  
  public void withdraw(double withdrawAmount) {
    total -= withdrawAmount;
  }

  public double getAmount() {
    return total;
  }
}