public class Teacher {
  String name;
  String title;
  int numberOfClasses;
  double classPrice;

  public void updateClassPrice(double percent) {
    this.classPrice *= (100.0 + percent) / 100.0;
    System.out.println("new value: " + String.format("%.2f", this.classPrice));
  }

  public Teacher getInfo() {
    return this;
  }

  public double getSalary() {
    double baseSalary, hourCost, paidRest;
    baseSalary = this.classPrice * 4.5 * this.numberOfClasses;
    if (this.title.equalsIgnoreCase("prof")) {
      baseSalary *= 1.03;
    } else if (this.title.equalsIgnoreCase("dr")) {
      baseSalary *= 1.085;
    }

    hourCost = baseSalary * 0.05;
    paidRest = (baseSalary + hourCost) / 6.0;

    return paidRest + baseSalary + hourCost;
  }

  @Override
  public String toString() {
    return "Teacher [name: " + this.name + ", title: " + this.title + "]";
  }

}