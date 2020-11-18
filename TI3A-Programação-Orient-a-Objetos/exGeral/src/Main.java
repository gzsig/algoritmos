import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
  static List<Person> people = new ArrayList<Person>();
  static int MAX_TABLES = 6;

  public static void main(String[] args) {

    String rawOp = "";
    int op = 0;
    while (op != 7) {
      try {
        rawOp = JOptionPane.showInputDialog(null,
            "Escolha uma operação \n1: Cadastrar Empregado.\n2: Cadastrar Cliente. \n3: Pesquisar. \n4: Listar Empregados. \n5: Listar Clientes. \n6: Remover \n7: Finalizar.");
        if (rawOp == null) {
          op = 7;
        } else {
          op = Integer.parseInt(rawOp);
        }
        if (op > 7) {
          JOptionPane.showMessageDialog(null, "Opção invalida");
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Você deve digitar um numero inteiro.");
        op = 0;
      } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, e);
        op = 0;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        op = 0;
      }

      program(op);
      System.out.println(people);
    }
  }

  public static void program(int op) {
    switch (op) {
      case 1:
        createEmploy();
        break;
      case 2:
        createClient();
        break;
      case 3:
        findPersonById();
        break;
      case 4:
        printEmploy();
        break;
      case 5:
        printClient();
        break;
      case 6:
        removePerson();
        break;

      default:
        return;
    }
  }

  public static void createEmploy() {
    String[] options = { "GERENTE", "VENDEDOR" };
    int type;
    String name, cpf, enrollment;

    type = optionDialog(options, "Cadastrar Empregado");
    if (type == -1) {
      return;
    }

    name = inputDialog("Qual é o nome do empregado?");
    cpf = inputDialog("E o cpf?");
    enrollment = inputDialog("Matricula?");

    if (type == 0) {
      double salary = Double.parseDouble(inputDialog("Qual é o salario do gerente?"));
      double bonus = Double.parseDouble(inputDialog("Qual é o bonus do gerente?"));
      Manager m = new Manager(name, cpf, enrollment, salary, bonus);
      people.add(m);
    } else {
      double totalAmountSold = Double.parseDouble(inputDialog("Qual é o total de vendas do vendedor?"));
      double commission = Double.parseDouble(inputDialog("Qual é a comissão do vendedor?"));
      SalesPerson sp = new SalesPerson(name, cpf, enrollment, totalAmountSold, commission);
      people.add(sp);
    }
  }

  public static void createClient() {
    String name, cpf;
    double debt;

    name = inputDialog("Qual é o nome do cliente?");
    cpf = inputDialog("E o cpf?");
    debt = Double.parseDouble(inputDialog("Valor da divida?"));

    Client c = new Client(name, cpf, debt);
    people.add(c);
  }

  public static void findPersonById() {
    String id;

    id = inputDialog("Qual é o cpf para pesquisar?");

    for (int i = 0; i < people.size(); i++) {
      if (people.get(i).getCpf().equals(id)) {
        dialog(id + " – " + people.get(i).getType());
        return;
      }
    }
    dialog("Não foi encontrado nenhuma pessoa com o cpf informado.");
    return;
  }

  public static void printEmploy() {
    String res = "";

    for (int i = 0; i < people.size(); i++) {
      if (people.get(i).getType().equals("Empregado")) {
        res += people.get(i).toString() + "\n";
      }
    }
    if (res.equals("")) {
      dialog("Não foi encontrado nenhum empregado.");
      return;
    }
    dialog(res);
    return;
  }

  public static void printClient() {
    String res = "";

    for (int i = 0; i < people.size(); i++) {
      if (people.get(i).getType().equals("Cliente")) {
        res += people.get(i).toString() + "\n";
      }
    }
    if (res.equals("")) {
      dialog("Não foi encontrado nenhum cliente.");
      return;
    }
    dialog(res);
    return;
  }

  public static void removePerson() {
    String[] options = { "SIM", "NÃO" };
    String id;
    int confirm;
    id = inputDialog("Qual é o cpf para remover?");

    for (int i = 0; i < people.size(); i++) {
      if (people.get(i).getCpf().equals(id)) {
        confirm = optionDialog(options, "Realmente deseja remover: " + people.get(i).toString());
        if (confirm == 0) {
          people.remove(people.get(i));
        }
        return;
      }
    }
    dialog("Não foi encontrado nenhuma pessoa com o cpf informado.");
    return;
  }

  public static void dialog(String text) {
    JOptionPane.showMessageDialog(null, text);
  }

  public static String inputDialog(String text) {
    String str = "";
    int loop = 0;
    while (loop == 0) {
      try {
        str = JOptionPane.showInputDialog(null, text);
        loop = 1;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        loop = 0;
      }
    }
    return str;
  }

  public static int optionDialog(String[] options, String text) {
    int option = -1;
    int loop = 0;
    while (loop == 0) {
      try {
        option = JOptionPane.showOptionDialog(null, text, null, JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, null, options, null);
        loop = 1;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        loop = 0;
      }
    }
    return option;
  }

}