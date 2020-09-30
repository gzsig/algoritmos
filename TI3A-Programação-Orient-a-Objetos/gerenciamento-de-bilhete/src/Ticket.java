public class Ticket {
  private int code;
  private User user;
  private double balance;
  private double ticketPrice = 4.4;

  public Ticket(int numero, User usuario, double saldo) {
    this.code = numero;
    this.user = usuario;
    this.balance = saldo;
  }

  public User getUser() {
    return this.user;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getData() {
    return this.code + " " + this.user.getData() + " " + this.balance;
  }

  public void chargeTrip() {
    this.balance -= this.ticketPrice;
  }

  public void rechargeTicket(double valor) {
    this.balance += valor;
  }

}
