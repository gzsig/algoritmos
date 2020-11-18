public class Client extends Person {
  private double debt;

  public Client(String name, String cpf, double debt) {
    super(name, cpf);
    this.debt = debt;
  }

}
