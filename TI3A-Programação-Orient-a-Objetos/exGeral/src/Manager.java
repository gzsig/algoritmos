public class Manager extends Employ implements Bonus {
  private double salary;
  private double bonus;

  public Manager(String name, String cpf, String enrollment, double salary, double bonus) {
    super(name, cpf, enrollment);
    this.bonus = bonus;
    this.salary = salary;
  }

  public double calcBonus() {
    return this.salary * this.bonus;
  }

}
