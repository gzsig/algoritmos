public class Main {
  public static void main(String[] args) {
    Pf pf = new Pf("gabriel", "123");
    System.out.println(pf);

    Appointment ap = new Appointment(pf, false);

    System.out.println(ap);
  }
}
