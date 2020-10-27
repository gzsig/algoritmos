import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
  static List<Appointment> appointments = new ArrayList<Appointment>();
  static int MAX_TABLES = 2;

  public static void main(String[] args) {
    int op = 0;

    while (op != 6) {
      try {
        op = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Restaurante SABOR SOFISTICADO \n1: Reservar mesa.\n2: Pesquisar reserva. \n3: Imprimir reservas. \n4: Imprimir lista de espera. \n5: Cancelar reserva. \n6: Finalizar."));
        if (op > 6) {
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
      System.out.println(appointments);
      System.out.println(appointments.size());
      System.out.println("\n\n");

    }
  }

  public static void program(int op) {
    switch (op) {
      case 1:
        bookTable();
        break;
      case 2:
        LookForReservation();
        break;

      default:
        return;
    }
  }

  public static void bookTable() {
    int type;
    String[] options = { "A vista", "Parcelado" };

    Client newCliente = createClient();
    type = optionDialog(options, "Forma de pagamento");

    Appointment ap = new Appointment(newCliente, type == 0 ? (true) : (false));
    if (appointments.size() >= MAX_TABLES) {
      dialog("O restaurante esta lotado, você é o numero " + (appointments.size() - MAX_TABLES + 1)
          + " na lista de espera");
    }
    appointments.add(ap);
  }

  public static void LookForReservation() {
    String id = inputDialog("Digito o CPF ou CNPJ do cliente");

    for (int i = 0; i < appointments.size(); i++) {
      if (appointments.get(i).getClientId().equals(id)) {
        if (i < MAX_TABLES) {
          dialog(appointments.get(i).getClient().getName() + " tem mesa reservada.");
        } else {
          dialog(appointments.get(i).getClient().getName() + " é " + (i - MAX_TABLES + 1) + " na lista de espera.");
        }
      }
    }

  }

  public static Client createClient() {
    String[] options = { "PJ", "PF" };
    String name = "";
    String id = "";
    int type;

    type = optionDialog(options, "Tipo de cliente");
    name = inputDialog("Nome do cliente");

    if (type == 0) {
      id = inputDialog("CNPJ do cliente");
      Pj pj = new Pj(name, id);
      return pj;
    } else {
      id = inputDialog("CPF do cliente");
      Pf pf = new Pf(name, id);
      return pf;
    }
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