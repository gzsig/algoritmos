public class Appointment implements Payment {
  private Client client;
  private boolean downPayment;

  public Appointment(Client client, boolean downPayment) {
    this.client = client;
    this.downPayment = downPayment;
  }

  public double calcAmountDue() {
    if (this.downPayment == true) {
      return 0.9 * 3200;
    } else {
      return 3200;
    }
  }

  public Client getClient() {
    return this.client;
  }

  public String getClientId() {
    if (this.client instanceof Pj) {
      return ((Pj) this.client).getCnpj();
    } else if (this.client instanceof Pf) {
      return ((Pf) this.client).getCpf();
    }
    return null;
  }

  @Override
  public String toString() {
    return "Appointment – " + this.client + ", downPayment: " + this.downPayment;
  }

}
