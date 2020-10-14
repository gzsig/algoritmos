import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
  private static Ticket[] DB = new Ticket[100];

  public static void main(String[] args) {
    Random generator = new Random();
    seed(generator);
    run();
  }

  private static void run() {
    Random generator = new Random();
    String credentials = JOptionPane.showInputDialog(null, "Senha ou CPF ou Sair");
    system(credentials, generator);
  }

  private static void system(String credentials, Random generator) {
    switch (credentials) {
      case "sair":
        JOptionPane.showMessageDialog(null, "Shut down");
        System.out.println("sair");
        break;
      case "admin":
        admPanel(generator);
        break;

      default:
        userPanel(credentials);
        break;
    }
  }

  private static void admPanel(Random generator) {
    String option;
    option = JOptionPane.showInputDialog(null,
        "Escolha uma operação \n1. Emitir bilhete \n2. Imprimir bilhete \n3. Consultar bilhete \n4. Sair");

    admControl(option, generator);
  }

  private static int DBSize() {
    int i = 0;
    while (DB[i] != null) {
      i++;
    }
    return i;
  }

  private static void admControl(String option, Random generator) {
    switch (option) {
      case "1":
        String name = JOptionPane.showInputDialog(null, "Informe o nome do usuário.");
        String id = JOptionPane.showInputDialog(null, "Informe o cpf do usuário (5 dígitos).");
        String balance = JOptionPane.showInputDialog(null, "Informe o valor a ser creditado");

        boolean valid = false;
        User.userType newUserType = null;

        while (!valid) {

          String type = JOptionPane.showInputDialog(null,
              "Informe o tipo do usuário:\n1. NORMAL \n2. ESTUDANTE \n3. PROFESSOR");

          switch (type) {
            case "1":
              newUserType = User.userType.NORMAL;
              valid = true;
              break;
            case "2":
              newUserType = User.userType.ESTUDANTE;
              valid = true;
              break;
            case "3":
              newUserType = User.userType.PROFESSOR;
              valid = true;
              break;

            default:
              JOptionPane.showMessageDialog(null, "Opção inválida");
              break;
          }
        }

        User newUser = new User(name, id, newUserType);

        int DBId = DBSize();

        if (DBId < 10) {
          DB[DBId] = new Ticket(generator.nextInt(8900) + 1000, newUser, Double.parseDouble(balance));
        } else {
          JOptionPane.showMessageDialog(null, "DB full");
        }
        admPanel(generator);
        break;

      case "2":

        int i = 0;
        String res = "";
        while (DB[i] != null) {
          res += "Usuário " + (i + 1) + ": " + DB[i].getData() + "\n";
          i++;
        }
        JOptionPane.showMessageDialog(null, res);

        admPanel(generator);
        break;

      case "3":
        id = JOptionPane.showInputDialog(null, "Informe o cpf do usuário (5 dígitos).");
        Ticket currentTicket = findTicket(id);
        if (currentTicket != null) {
          JOptionPane.showMessageDialog(null, currentTicket.getData());
        } else {
          JOptionPane.showMessageDialog(null, "Bilhete não encontrado.");
        }
        admPanel(generator);
        break;
      case "4":
        JOptionPane.showMessageDialog(null, "Sessão encerrada ");
        run();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção inválida");
        admPanel(generator);
        break;
    }
  }

  private static void userPanel(String id) {
    String option;

    Ticket currentTicket = findTicket(id);

    if (currentTicket != null) {
      System.out.println(currentTicket.getData());
      option = JOptionPane.showInputDialog(null,
          "Escolha uma operação \n1. Carregar bilhete \n2. Passar na catraca \n3. Consultar saldo \n4. Sair");

      userControl(currentTicket, option);
    } else {
      JOptionPane.showMessageDialog(null, "Usuário não encontrado");
      run();
    }
  }

  private static Ticket findTicket(String id) {
    int i = 0;
    while (DB[i] != null) {
      if (id.equals(DB[i].getUser().getId())) {
        System.out.println("achei");
        return DB[i];
      }
      i++;
    }
    return null;
  }

  private static void userControl(Ticket ticket, String option) {
    switch (option) {
      case "1":
        String valor = JOptionPane.showInputDialog(null, "Qual valor para adicionar ao saldo?");
        ticket.rechargeTicket(Double.parseDouble(valor));
        System.out.println(ticket.getData());
        userPanel(ticket.getUser().getId());
        break;
      case "2":
        if (ticket.getBalance() >= 4.4) {
          ticket.chargeTrip();
          JOptionPane.showMessageDialog(null, "Passou na catraca com sucesso");
        } else {
          JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }
        System.out.println(ticket.getData());
        userPanel(ticket.getUser().getId());
        break;
      case "3":
        JOptionPane.showMessageDialog(null, "Seu saldo é: " + ticket.getBalance());
        userPanel(ticket.getUser().getId());
        break;
      case "4":
        JOptionPane.showMessageDialog(null, "Sessão encerrada ");
        run();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção inválida");
        userPanel(ticket.getUser().getId());
        break;
    }
  }

  // Four default tickets
  private static void seed(Random generator) {
    User ana = new User("Ana", "00000", User.userType.ESTUDANTE);
    User thais = new User("Thais", "11111", User.userType.ESTUDANTE);
    User gabriel = new User("Gabriel", "22222", User.userType.ESTUDANTE);
    User selmini = new User("Selmini", "33333", User.userType.PROFESSOR);

    DB[0] = new Ticket(generator.nextInt(8900) + 1000, ana, 25);
    DB[1] = new Ticket(generator.nextInt(8900) + 1000, thais, 4);
    DB[2] = new Ticket(generator.nextInt(8900) + 1000, gabriel, 25);
    DB[3] = new Ticket(generator.nextInt(8900) + 1000, selmini, 25);
  }

}
