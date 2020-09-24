public class Ticket {
  int code;
  User user;
  double balance;
  double ticketPrice = 4.4;

  public Ticket(int numero, User usuario, double saldo) {
    this.code = numero;
    this.user = usuario;
    this.balance = saldo;
  }

  public String getData() {
    return this.code + this.user.getData() + this.balance;
  }

  public void chargeTrip() {
    this.balance -= this.ticketPrice;
  }

  public void rechargeTicket(double valor) {
    this.balance += valor;
  }

}
