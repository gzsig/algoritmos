public class Reservation implements Payment {
  private Client client;
  private boolean downPayment;

  public Reservation(Client client, boolean downPayment) {
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

  public String getPaymentType() {
    if (this.downPayment == true) {
      return "A vista";
    } else {
      return "Parcelado";
    }
  }

  @Override
  public String toString() {
    return "Reservation – " + this.client + ", downPayment: " + this.downPayment;
  }

}
