public class Employ extends Person {
  protected String enrollment;

  public Employ(String name, String cpf, String enrollment) {
    super(name, cpf);
    this.enrollment = enrollment;
  }
}