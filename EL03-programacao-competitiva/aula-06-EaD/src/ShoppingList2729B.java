import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * ShoppingList2729B
 */
public class ShoppingList2729B {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n = 0;

    n = keyboard.nextInt();
    keyboard.nextLine();
    for (int i = 0; i < n; i++) {
      String items = keyboard.nextLine();
      String[] shoppingListArray = items.split(" ");
      List<String> shoppingListOrder = new ArrayList<>(Arrays.asList(shoppingListArray));
      Set<String> shoppingList = new HashSet<>(shoppingListOrder);
      shoppingList.addAll(shoppingListOrder);
      shoppingListOrder.clear();
      for (String s : shoppingList) {
        shoppingListOrder.add(s);
      }
      Collections.sort(shoppingListOrder);
      for (int j = 0; j < shoppingListOrder.size(); j++) {
        if (j < shoppingListOrder.size() - 1) {
          System.out.print(shoppingListOrder.get(j) + " ");
        } else {
          System.out.print(shoppingListOrder.get(j) + "\n");
        }
      }
    }

    keyboard.close();
  }
}
