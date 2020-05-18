import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ListaDeChamada2381
 */
public class ListaDeChamada2381 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    List<String> listStudents = new ArrayList<String>();
    String sInitialInfo, sPickedStudentName;
    int iNumberOfStudents, iPickedStudentIndex;

    sInitialInfo = keyboard.nextLine();

    String[] stringIntegars = sInitialInfo.split(" ");

    iNumberOfStudents = Integer.parseInt(stringIntegars[0]);
    iPickedStudentIndex = Integer.parseInt(stringIntegars[1]);

    for (int i = 0; i < iNumberOfStudents; i++) {
      listStudents.add(keyboard.next());
    }
    Collections.sort(listStudents);
    sPickedStudentName = listStudents.get(iPickedStudentIndex - 1);
    System.out.println(sPickedStudentName);
    keyboard.close();
  }
}