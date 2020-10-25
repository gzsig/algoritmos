public class Pf extends Client {
  private String cpf;

  public Pf(String name, String cpf) {
    super(name);
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "type: pf, name: " + this.getName() + ", cpf: " + this.cpf;
  }
}
