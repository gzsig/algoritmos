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

  @Override
  public String toString() {
    return "Appointment – " + this.client + ", downPayment: " + this.downPayment;
  }

}
