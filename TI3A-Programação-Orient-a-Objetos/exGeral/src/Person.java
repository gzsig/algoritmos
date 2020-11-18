public abstract class Person {

  protected String name;
  protected String cpf;

  public Person(String name, String cpf) {
    this.name = name;
    this.cpf = cpf;
  }

  public String getType() {
    if (this instanceof Employ) {
      return "Empregado";
    } else if (this instanceof Client) {
      return "Cliente";
    }
    return null;
  }

  public String getCpf() {
    return this.cpf;
  }

  @Override
  public String toString() {
    return "name: " + this.name + ", cpf: " + this.cpf;
  }

}
