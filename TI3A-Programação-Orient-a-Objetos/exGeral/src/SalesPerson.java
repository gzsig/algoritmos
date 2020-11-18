public class SalesPerson extends Employ implements Salary {
  private double totalAmountSold;
  private double commission;

  public SalesPerson(String name, String cpf, String enrollment, double totalAmountSold, double commission) {
    super(name, cpf, enrollment);
    this.commission = commission;
    this.totalAmountSold = totalAmountSold;
  }

  public double calcSalary() {
    return this.commission * this.totalAmountSold;
  }

}
