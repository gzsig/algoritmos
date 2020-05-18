import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/** * ShoppingList2729 */
public class ShoppingList2729 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    List<String> shoppingListOrder = new ArrayList<>();
    Set<String> shoppingList = new HashSet<>();
    String[] shoppingListArray;
    String items = "";
    int n = 0;
    n = keyboard.nextInt();
    keyboard.nextLine();
    for (int i = 0; i < n; i++) {
      items = keyboard.nextLine();
      shoppingListArray = items.split(" ");
      for (String s : shoppingListArray) {
        shoppingList.add(s);
      }
      for (String s : shoppingList) {
        shoppingListOrder.add(s);
      }
      Collections.sort(shoppingListOrder);
      for (int j = 0; j < shoppingListOrder.size(); j++) {
        System.out.print(shoppingListOrder.get(j));
        if (j != shoppingListOrder.size() - 1) {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
      shoppingList.clear();
      shoppingListOrder.clear();
    }
    keyboard.close();
  }
}