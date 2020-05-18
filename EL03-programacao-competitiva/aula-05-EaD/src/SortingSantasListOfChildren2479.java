import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * SortingSantasListOfChildren2479
 */
public class SortingSantasListOfChildren2479 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    List<String> listChildren = new ArrayList<String>();
    int iNumberOfChildren = 0, iContGood = 0, iContBad = 0;
    String sUserInput;
    iNumberOfChildren = keyboard.nextInt();
    sUserInput = keyboard.nextLine();
    for (int i = 0; i < iNumberOfChildren; i++) {
      sUserInput = keyboard.nextLine();
      String[] sArray = sUserInput.split(" ");
      if (sArray[0].equalsIgnoreCase("+")) {
        iContGood++;
      } else {
        iContBad++;
      }
      listChildren.add(sArray[1]);
    }
    Collections.sort(listChildren);
    for (int i = 0; i < listChildren.size(); i++) {
      System.out.println(listChildren.get(i));
    }
    System.out.println("Se comportaram: " + iContGood + " | Nao se comportaram: " + iContBad);
    keyboard.close();
  }

}