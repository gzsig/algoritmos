public class Main {
  public static void main(String[] args) {
    Teacher t1 = new Teacher();
    Teacher t2 = new Teacher();
    t1.name = "Gabriel";
    t1.title = "dr";
    t1.classPrice = 175;
    t1.numberOfClasses = 32;

    System.out.println(t1.getSalary());
    t1.updateClassPrice(30);
    System.out.println(t1.getSalary());
  }
}