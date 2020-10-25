public class Pj extends Client {
  private String cnpj;

  public Pj(String name, String cnpj) {
    super(name);
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "type: pj, name: " + this.getName() + ", cnpj: " + this.cnpj;
  }

}
