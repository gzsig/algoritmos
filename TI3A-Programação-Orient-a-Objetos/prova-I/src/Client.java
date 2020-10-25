public abstract class Client {

  private String name;

  public Client(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Client – [name: " + this.name + "]";
  }

}
