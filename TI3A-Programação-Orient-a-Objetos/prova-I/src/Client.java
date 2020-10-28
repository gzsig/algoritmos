public abstract class Client {

  private String name;

  public Client(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getId() {
    if (this instanceof Pj) {
      return ((Pj) this).getCnpj();
    } else if (this instanceof Pf) {
      return ((Pf) this).getCpf();
    }
    return null;
  }

  public String getType() {
    if (this instanceof Pj) {
      return "Pessoa jurídica";
    } else if (this instanceof Pf) {
      return "Pessoa física";
    }
    return null;
  }

  @Override
  public String toString() {
    return "Client – [name: " + this.name + "]";
  }

}
