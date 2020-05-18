import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * FriendsOfHabay
 */
public class FriendsOfHabay2136 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    List<String> yesArray = new ArrayList<String>();
    List<String> noArray = new ArrayList<String>();
    String in, friend;
    friend = "";
    
    in = keyboard.nextLine();
    while (!in.equalsIgnoreCase("FIM")) {
      String[] temp = in.split(" ");
      if (temp[1].equalsIgnoreCase("yes") && !yesArray.contains(temp[0])) {
        yesArray.add(temp[0]);
        if(friend.length() < temp[0].length()){
          friend = temp[0];
        }
      } else if (temp[1].equalsIgnoreCase("no")){
        noArray.add(temp[0]);
      }
      in = keyboard.nextLine();
    }
    
    Collections.sort(yesArray);
    Collections.sort(noArray);

    for (int i = 0; i < yesArray.size(); i++) {
      System.out.println(yesArray.get(i));
    }
    for (int i = 0; i < noArray.size(); i++) {
      System.out.println(noArray.get(i));
    }
    System.out.println("\nAmigo do Habay:\n" + friend);
    keyboard.close();
  }
}
