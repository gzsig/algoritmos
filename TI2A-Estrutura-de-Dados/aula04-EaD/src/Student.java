/**
 * Student
 */
public class Student {
  String name;
  int ra;
  double grade1, grade2, average;

  public void getAverage() {
    average = (grade1 + grade2) / 2;
  }

  public String getStatuss() {
    if (average >= 7) {
      return "Pass";
    }
    return "Fail";
  }

}