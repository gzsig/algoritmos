import java.util.Scanner;

/**
 * MainAccount
 */
public class MainAccount {
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  Account myAccount = new Account();
  double withdrawAmount;
  myAccount.name = keyboard.next();
  withdrawAmount = keyboard.nextDouble();
  myAccount.withdraw(withdrawAmount);
  System.out.println(myAccount.name +"'s account has " + myAccount.getAmount() + "dollars :)");
  keyboard.close();
}
  
}